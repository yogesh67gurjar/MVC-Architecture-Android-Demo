# MVC Architecture Demo - Android App

![MVC-in-Android-Application-Development-](https://github.com/user-attachments/assets/a993497a-1a1c-403d-9dfd-962228902be8)

This is a simple Android app that demonstrates the **Model-View-Controller (MVC)** architecture with two different implementations:
1. **Without a Separate Controller**: All logic is handled directly within the `Activity`.
2. **With a Separate Controller**: Business logic is separated into a controller class, adhering to proper MVC principles.

## Features
- **API Integration**: Fetches random cat facts from [CatFact API](https://catfact.ninja/).
- **Retrofit**: Used for networking.
- **Two Activity Implementations**:
  - **OneActivity**: Directly handles API call inside the `Activity`.
  - **TwoActivity**: Delegates the API call to a separate `MyController` class.

## Project Structure
- **OneActivity**: Demonstrates a basic implementation where the controller logic is not separated from the view (`Activity`).
- **TwoActivity**: Implements proper MVC separation where the `Activity` only handles UI updates, and the `MyController` handles business logic and API calls.

## How to Run
1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or a real device.

## Libraries Used
- **Retrofit**: For API requests and responses.
- **Gson**: For parsing JSON responses.

## API Reference
- [CatFact API](https://catfact.ninja/)

## Contact
- **Email**: [yogesh67gurjar@gmail.com](mailto:yogesh67gurjar@gmail.com)
- **GitHub**: [github.com/yogesh67gurjar](https://github.com/yogesh67gurjar)
