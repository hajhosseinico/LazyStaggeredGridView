
# LazyStaggeredGridView

<div align="center">
    <img src="https://github.com/user-attachments/assets/c88827c7-a591-4630-8a5c-14d98eba41a9" width="400">
</div>

`LazyStaggeredGridView` is a modern Android application that showcases a staggered grid layout using Jetpack Compose’s LazyVerticalStaggeredGrid. It is designed to provide a visually engaging display of images with randomized aspect ratios for a dynamic staggered effect, offering a smooth, performant experience.

## 🚀 Features

- **Staggered Grid Layout**: Displays images in a responsive grid with adaptive column sizes to fit various screen dimensions.
- **Full-Screen Image Preview**: Allows users to tap an image for a full-screen view with an easy transition back to the grid.
- **Jetpack Compose**: Built entirely with Jetpack Compose, enabling a modern and declarative UI structure.
- **Dynamic Aspect Ratios**: Randomized aspect ratios for images within the grid, creating a visually interesting staggered effect.

## 📱 Technologies and Libraries

### Core Libraries

- **AndroidX Core KTX**: Simplified development with Kotlin extensions.
- **Material Design 3**: Consistent, modern UI elements following Material guidelines.
- **Compose Navigation**: For seamless navigation across different screens.

### UI and Image Loading

- **Jetpack Compose**: A declarative UI toolkit for building responsive Android interfaces.
- **Material Design Components**: Utilizes Material Design principles for a polished look.
- **Coil**: Lightweight image loading library optimized for Jetpack Compose.

### State Management and Animations

- **State Management with MutableState**: Efficient handling of UI state with Jetpack Compose’s state management tools.
- **Modifier Animations**: Uses Compose’s `Modifier` for smooth UI adjustments and responsiveness.

## 🛠️ Build Setup

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/hajhosseinico/LazyStaggeredGridView
    cd LazyStaggeredGridView
    ```

2. **Setup Dependencies**: Open the project in Android Studio and sync to download dependencies.

3. **Build and Run**: Select an emulator or connected device and click **Run** in Android Studio.

## 📚 Project Architecture

The project is structured with a clean architecture to ensure modularity, scalability, and maintainability:

- **Presentation Layer**: Contains `MainActivity` and `ImageStaggeredGrid`, which handle UI logic and user interactions with Jetpack Compose.
- **Data Layer**: Manages image URLs and serves as a base for integrating network or database sources in future development.
- **State Management**: Uses Compose’s `remember` and `MutableState` for maintaining UI state across different parts of the grid and full-screen views.

## 🧩 Libraries and Dependencies

- **Jetpack Compose**: Primary UI framework.
- **Coil**: Lightweight image loading for Compose.
- **Material Design 3**: Implements the latest Material Design components.
- **Kotlin Coroutines**: Manages asynchronous tasks efficiently.
- **AndroidX Core KTX**: Boosts productivity with Kotlin extensions.

## 👨‍💻 Contribution

Contributions are welcome! If you would like to improve functionality or add features, feel free to submit a pull request. Ensure your code follows the project’s coding style and passes all tests.

## 📄 License

This project is available for educational purposes and is open for learning, building, and improvement.

## 📬 Contact

For questions or suggestions, please reach out:

- **Author**: Ali Hajhosseini
- **Email**: hajhosseinico@gmail.com
- **GitHub**: [hajhosseinico](https://github.com/hajhosseinico)
