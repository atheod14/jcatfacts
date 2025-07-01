package com.example.catfacts

// Required imports
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.catfacts.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import android.media.MediaPlayer


class MainActivity : AppCompatActivity() {

    // ViewBinding gives us direct access to views in activity_main.xml
    private lateinit var binding: ActivityMainBinding

    // MediaPlayer instance
    private var meowPlayer: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Replaces findViewById for xml obj
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load meow sound
        meowPlayer = MediaPlayer.create(this, R.raw.cat_meow)

        // Set a click event listener on the button to call the api getter on click
        binding.showFactButton.setOnClickListener {
            playMeow()
            fetchCatFact()
        }
    }

    // Function to fetch a random cat fact from the API
    private fun fetchCatFact() {
        // Show the loader and disable the button
        showLoading(true)

        //Handle the HTTP request
        val retrofit = Retrofit.Builder()
            .baseUrl("https://catfact.ninja/") // Base URL of the API
            .addConverterFactory(GsonConverterFactory.create()) // Convert JSON to Kotlin objects
            .build()

        // Create an implementation of the API interface
        val service = retrofit.create(CatFactApi::class.java)

        // Launch a coroutine in the lifecycleScope (safe way to make background calls in Android)
        lifecycleScope.launch {
            try {
                // Make the network request (suspend function)
                val response = service.getRandomCatFact()

                // onSuccess
                if (response.isSuccessful) {
                    // Get the body of the response (CatFact object)
                    val fact = response.body()

                    // Display in the TextView (or show fallback message)
                    binding.factTextView.text = fact?.fact ?: "No fact found."
                } else {
                    //  show error message onError
                    showError("Failed to fetch cat fact.")
                }

            } catch (e: Exception) {
                // Catch any network or parsing errors
                showError("Network error: ${e.message}")
            } finally {
                // Always hide the loading spinner and re-enable button
                showLoading(false)
            }
        }
    }

    // Function to play meow sound
    private fun playMeow() {
        meowPlayer?.let {
            if (it.isPlaying) {
                it.seekTo(0) // Restart if already playing
            } else {
                it.start()
            }
        }
    }
    // Show or hide the progress bar and enable/disable the button
    private fun showLoading(show: Boolean) {
        binding.loadingIndicator.visibility = if (show) View.VISIBLE else View.GONE
        binding.showFactButton.isEnabled = !show
    }

    // Show a short popup message at the bottom of the screen
    private fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    // Clean up
    override fun onDestroy() {
        super.onDestroy()
        meowPlayer?.release()
        meowPlayer = null
    }
}
