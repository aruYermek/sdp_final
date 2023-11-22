# sdp_final
<img width="175" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/3d228e41-2477-4e89-a8eb-6e1184ba8581">

## VIRTUAL VENDING MACHINE - Final Project

### Software Design Patterns Course - Group SE-2226

**Team members:** Aruzhan Yermek, Gulimzhan Orynbassar  
**Teaching Assistant:** Arailym Bakenova  

### Project Overview

#### Project Description
The project involves creating a console-based system for user registration, login, and product management. Users can choose products, view prices in different currencies, and make purchases. Additional features include currency conversion, decorators for extra product features, and an observer pattern for product quantity notifications.

#### Objectives
1. **User Registration and Login:**
   - Allow users to register accounts.
   - Provide a login system for registered users.
2. Product Management:**
   - Display a menu of products.
   - Allow users to select products and view prices.
   - Implement currency conversion for product prices.
3. **Decorator Pattern:**
   - Implement the decorator pattern for adding extra features (e.g., Straw, Ice, Napkin) to selected products.
4. **Observer Pattern:**
   - Implement the observer pattern to notify users when a product's quantity reaches zero.
5. **Payment Processing:**
   - Provide payment options (Card, QR code).
   - Implement payment processing strategies using the strategy pattern.
6. **Flexibility and Extensibility:**
   - Use design patterns to make the system flexible and extensible, allowing for easy addition of new features or modifications.

### UML Diagram
![UML Diagram](<img width="452" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/ccd3c521-3982-47f6-84de-1f9b85338325">
)


[GitHub Repository](https://github.com/aruYermek/sdp_final.git)

### Main Body

#### 1. Database Connection
- The project interacts with a PostgreSQL database for user registration and login.
- The `DatabaseConnection` class uses a singleton pattern to ensure a single instance of the database connection.
<img width="319" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/a97a629d-d1ba-4b43-b2b2-ffc98b2be041">

#### 2. User Authentication
- The login functionality, implemented in the `LogIn` class, relies on the `DatabaseConnection` class to verify user credentials.
<img width="315" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/1699a31c-8fae-49ff-ac6d-1047531fbb35">

#### 3. Product Details
- The `Product` class and its subclasses (Drink, Snack, Dessert) represent various products in the menu.
- Each product has a unique ID, a name, a price, and a quantity.
<img width="316" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/f7e30426-c04e-4918-bd87-4f8671477746">
<img width="311" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/1cc88211-ca71-4830-b94e-67fd5e129b33">
<img width="315" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/0b8e5e5d-0c83-4a1a-bcc3-f75a12c803fa">
<img width="315" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/bfc01f33-e6d0-47fa-adeb-5a396da8d3fd">

#### 4. Menu System
- The `Menu` class serves as the central hub for user interaction.
- Users can choose products, view prices in different currencies, and add extra features using the decorator pattern.
<img width="304" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/ea8e84ce-b344-4afe-a53b-23792ca9d9bd">

#### 5. Decorator Pattern Usage
- The decorator pattern enhances products with additional features such as Straw, Ice, and Napkin.
- Users can customize their product selections during the purchase process.
<img width="319" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/e09889c1-0380-418c-8e7a-77ac22b8bf67">
<img width="311" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/b1c6e5fb-91e5-4652-a715-e0dfa059d661">
<img width="314" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/30725a06-8242-46c1-8e01-e11bea22d4c9">
<img width="309" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/f8b75049-5c10-47d9-ac6b-1100f8edc1ed">
<img width="307" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/8b45c3c2-33e0-41b2-a5ec-babcb29a6013">

#### 6. Currency Adapter
- The project includes a currency adapter system for converting product prices to different currencies.
<img width="310" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/dc1624e1-e0c8-48b7-b2ab-e9ad26254250">
<img width="311" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/e2c39159-98c6-490d-a37a-cf9728ede014">
<img width="315" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/a0b162b6-1fe5-4490-949b-e7bb72c54ef1">

#### 7. Payment Processing
- Payment processing is implemented using the strategy pattern.
- Users can choose between card payments and QR code payments.
<img width="303" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/c127ba24-d545-4158-b4b9-327365704e23">
<img width="308" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/48ddd26d-8c49-4516-8b56-0880faaad0f2">
<img width="307" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/a9a78982-fcc7-4a31-bf16-d44b7aa58b2e">

#### 8. Observer Pattern
- The observer pattern is applied in the `ProductQuantityObserver` class, notifying users when a product's quantity reaches zero.
<img width="327" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/b5ac65df-e2b2-4340-ab05-49a5b83d9142">
<img width="329" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/88765ac6-ae7f-47aa-bdc5-cc828c66915e">
<img width="336" alt="image" src="https://github.com/aruYermek/sdp_final/assets/125209685/df107cc0-92f7-49a7-b9ee-09a105604fc2">

#### 9. Flexibility and Extensibility
- Design patterns (Singleton, Strategy, Observer, Decorator) contribute to a flexible and extensible system.

#### 10. Notification System
- The `ProductQuantityObserver` class provides a notification system alerting users when a product is out of stock.

#### 11. Error Handling
- Minimal error handling is present; enhancing error handling for user inputs and database operations is recommended.

#### 12. User Experience
- The console-based interface may be suitable for a prototype; consider a graphical user interface (GUI) for a more user-friendly experience.

### Conclusion

#### Key Points
- Modular and extensible system using design patterns.
- Integration of user authentication, product management, currency conversion, payment processing, and notifications.
- Console-based user interface for simplicity.

#### Challenges Faced
- Minimal error handling.
- Console interface limitations for a more intuitive user experience.

#### Insights
- Effective use of design patterns for scalability and maintainability.
- Covers features commonly found in e-commerce systems.

#### Future Improvements
- Implementation of a GUI for enhanced user experience.
- Strengthening error handling mechanisms.
- Providing more detailed notifications.
- Implementing a logging mechanism.

### References

- Refactoring.Guru: [Refactoring and design patterns](https://refactoring.guru/)
- Medium: [Adapter Pattern - What It Is and How to Use It?](https://medium.com/swlh/adapter-pattern-what-it-is-and-how-to-use-it-83e35a02e7f9)
- Baeldung: [Structural patterns in core Java](https://www.baeldung.com/java-core-structural-patterns)
- Medium: [Factory Design Pattern](https://medium.com/@sandeep.singh2632/factory-design-pattern-b51218ac378f)
- Scaler Topics: [Abstract Factory Design Pattern](https://www.scaler.com/topics/design-patterns/abstract-factory-design-pattern/)
