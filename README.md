<!-- Improved compatibility of back to top link -->
<a id="readme-top"></a>

<!-- PROJECT SHIELDS -->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <h3 align="center">
🐱 CatFacts App
  </h3>
  <p align="center">
    A minimal Kotlin Android app that fetches random cat facts
    <br />
    <a href="https://github.com/atheod14/jcatfacts"><strong>Explore the code »</strong></a>
    <br />
    <br />
    <a href="#usage">Run Instructions</a>
    ·
    <a href="#roadmap">Roadmap</a>
    ·
    <a href="#contributing">Contribute</a>
  </p>
</div>

---

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#-about-the-project">📄 About The Project</a></li>
    <li><a href="#%EF%B8%8F-built-with">⚖️ Built With</a></li>
    <li><a href="#-how-to-run">🚀 How to Run</a></li>
    <li><a href="#%EF%B8%8F-on-emulator">🖥️ On Emulator</a></li>
    <li><a href="#%EF%B8%8F-roadmap">🛠️ Roadmap</a></li>
    <li><a href="#%EF%B8%8F-contributing">♻️ Contributing</a></li>
    <li><a href="#-license">📆 License</a></li>
    <li><a href="#-contact">👥 Contact</a></li>
    <li><a href="#-acknowledgments">✨ Acknowledgments</a></li>
  </ol>
</details>

---

## 📄 About The Project

CatFacts is a lightweight Android app that fetches random cat facts using Retrofit and displays them beautifully in a modern UI.

- ✨ Kotlin + ViewBinding + Coroutines
- ⏳ Custom progress bar color
- ✨ Rounded modern buttons
- 🐱 Data fetched from [https://catfact.ninja/fact](https://catfact.ninja/fact)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## ⚖️ Built With

- Kotlin 2.0.21
- Android SDK 36 (minSdk 24)
- Retrofit 2.9.0
- Gson 2.9.0
- ViewBinding

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🚀 How to Run

### 📱 On Physical Device (Wireless Debugging)
1. Enable **Developer Options > Wireless Debugging** on your device
2. In Android Studio: `Device Manager > Pair using QR Code`
3. Launch the app from Android Studio

---

### 🖥️ On Emulator

**Step 1: Start Emulator**
```powershell
cd C:\Users\<yourUsername>\AppData\Local\Android\Sdk\emulator
.\emulator -avd <yourEmulatorName>
```

**Step 2: Verify it started**
```powershell
cd C:\Users\<yourUsername>\AppData\Local\Android\Sdk\platform-tools
. db devices
```
Expected:
```
List of devices attached
emulator-5554   device
```

**Step 3:** In Android Studio:
- `Tools > Device Manager > ▶️ Run`

---

## 🛠️ Roadmap

- [x] Fetch cat fact from API
- [x] Add button with rounded corner styling
- [x] Spinner tint support
- [ ] Add light/dark theme switch
- [ ] Add pull-to-refresh

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## ♻️ Contributing

1. Fork the repo
2. Create a new branch: `git checkout -b feature/amazing-feature`
3. Commit changes: `git commit -m 'Add amazing feature'`
4. Push to the branch: `git push origin feature/amazing-feature`
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 📆 License

Distributed under the **MIT License**. See `LICENSE` file for more info.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 👥 Contact

Alexandros Theodosiou — [LinkedIn](https://www.linkedin.com/in/alexandros-theodosiou-052a71212/)

Project Link: [github.com/atheod14/jcatfacts](https://github.com/atheod14/jcatfacts)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## ✨ Acknowledgments

- [Cat Fact API](https://catfact.ninja)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- SHIELDS -->
[contributors-shield]: https://img.shields.io/github/contributors/atheod14/jcatfacts.svg?style=for-the-badge
[contributors-url]: https://github.com/atheod14/jcatfacts/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/atheod14/jcatfacts.svg?style=for-the-badge
[forks-url]: https://github.com/atheod14/jcatfacts/network/members
[stars-shield]: https://img.shields.io/github/stars/atheod14/jcatfacts.svg?style=for-the-badge
[stars-url]: https://github.com/atheod14/jcatfacts/stargazers
[issues-shield]: https://img.shields.io/github/issues/atheod14/jcatfacts.svg?style=for-the-badge
[issues-url]: https://github.com/atheod14/jcatfacts/issues
[license-shield]: https://img.shields.io/github/license/atheod14/jcatfacts.svg?style=for-the-badge
[license-url]: https://github.com/atheod14/jcatfacts/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/alexandros-theodosiou-052a71212/
