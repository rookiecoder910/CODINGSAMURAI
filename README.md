# 🎬 MovizApp: Cinematic Movie Browser

![GitHub Repo stars](https://img.shields.io/github/stars/rookiecoder910/MovizApp?style=social)
![GitHub forks](https://img-shields.io/github/forks/rookiecoder910/MovizApp?style=social)
![GitHub issues](https://img.shields.io/github/issues/rookiecoder910/MovizApp)
![GitHub license](https://img.shields.io/github/license/rookiecoder910/MovizApp)

---

## ✨ About

**MovizApp** is a modern **Android movie browsing application** developed using **Kotlin and Jetpack Compose**. It is a robust showcase of clean architecture, MVVM, and real-time data synchronization.

The app fetches **popular movie data** from the TMDB API, provides a rich user experience with a stunning **dark, cinematic background**, and allows seamless search and navigation to detailed movie pages.

---

## ⚡ Key Features & Technologies

| Feature | Description | Skills Demonstrated |
| :--- | :--- | :--- |
| **Data Sync & Caching** | Uses **Room** for local database caching, ensuring the **popular movies** list is available offline. | **Room Migrations, MVVM, Data Persistence** |
| **Dynamic Search** | Implements a functional **SearchBar** that integrates with the TMDB search endpoint to provide live suggestions and full search results. | **Retrofit API Integration, State Management** |
| **Rich Detail View** | Dedicated screen for full movie details, including **ratings, release dates**, and a visually dominant poster header. | **Jetpack Compose Navigation, UI/UX Design** |
| **Cinematic UI** | Features a deep **Planet Earth dark mode background** with transparent headers and action buttons for a visually striking aesthetic. | **Custom Composables, Material3 Theming** |
| **Core UI/Logic** | Modern card layout with **smooth animations** for expanding/collapsing descriptions (**Read more / Read less** toggle). | **Animated Composables, Clean UI Design** |

---

## 📸 Screenshots

| Home Screen (Popular Movies) | Movie Detail Screen |
| :---: | :---: |
| <img src="https://github.com/user-attachments/assets/061e1fc5-08ac-421a-8b00-8ea4ddac3cf1" width="300"/> | <img width="400" height="802" alt="Screenshot 2025-10-16 015010" src="https://github.com/user-attachments/assets/eb553183-a455-4d1f-88a1-a7c645366d1e" />
 |

---

## 🏗 Architecture & Dependencies

This project strictly follows the **MVVM (Model-View-ViewModel)** architectural pattern.

### Architecture Flow
1.  **UI (Jetpack Compose):** Observes state from ViewModel, handles user interaction, and navigates.
2.  **ViewModel:** Manages UI state, contains business logic, and orchestrates data fetching/caching.
3.  **Repository:** Acts as a single source of truth, deciding whether to fetch data from **Retrofit (API)** or **Room (Local Cache)**.
4.  **Data Layer (Retrofit/Room):** Handles network calls and database transactions.

### Libraries Used
* **Networking:** Retrofit, OkHttp
* **Persistence:** Room Database (with migrations for schema updates)
* **UI Toolkit:** Jetpack Compose & Material3
* **Asynchronous:** Kotlin Coroutines & Flow
* **Image Loading:** Coil (for asynchronous image handling)
* **UI Components:** Accompanist (for Swipe-to-Refresh functionality)

---

## ⚡ Setup Instructions

1.  **Clone the repository**
    ```bash
    git clone [https://github.com/rookiecoder910/MovizApp.git](https://github.com/rookiecoder910/MovizApp.git)
    cd MovizApp
    ```

2.  **Add Your TMDB API Key**
    The app requires a valid TMDB API key to fetch movie data. Create a file named **`local.properties`** in your project root and add your key:
    ```properties
    tmdbApiKey="YOUR_TMDB_API_KEY_HERE"
    ```

3.  **Run the application**
    Open the project in Android Studio and run it on a physical device or emulator.
