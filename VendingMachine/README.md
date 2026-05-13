# Java Vending Machine

A simple console-based vending machine application written in Java.  
This project was created as part of Assignment 10 and demonstrates object-oriented programming concepts such as classes, interfaces, arrays, encapsulation, and polymorphism.

---

## Features

- View available vending machine items
- Purchase items using a payment system
- Track remaining item quantities
- Detect sold out items
- Display current cash balance
- Input validation for menu selections
- Uses a payment interface for expandable payment methods

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Interfaces
- Arrays
- Console Input/Output
- Scanner Class

---

## Project Structure

### `Main.java`
Controls the user interface and menu system.

Responsibilities:
- Displays the menu
- Handles user input
- Initializes vending machine stock
- Processes purchases

---

### `VendingMachine.java`
Represents the vending machine itself.

Responsibilities:
- Stores item names, prices, and quantities
- Displays inventory
- Handles purchases
- Updates stock quantities

---

### `PaymentMethod.java`
An interface representing a generic payment method.

Methods:
- `ProcessPayment()`
- `PaymentType()`
- `AvailableBalance()`

This allows future expansion for additional payment types such as:
- Credit cards
- Mobile payments
- Gift cards

---

### `CashPayment.java`
Implements the `PaymentMethod` interface.

Responsibilities:
- Tracks available cash
- Processes payments
- Returns payment type
- Displays remaining balance

---

## Example Menu

```text
===== VENDING MACHINE =====
1. View items
2. Purchase item
3. Check balance
4. Quit
===========================
Example Output
Stocked: Chips ($1.50) x 3
Stocked: Soda ($2.00) x 2
Stocked: Candy ($1.25) x 5
1. Chips - $1.50 (3 left)
2. Soda - $2.00 (2 left)
3. Candy - $1.25 (5 left)
Purchased: Chips for $1.50 using Cash
Concepts Demonstrated

This project demonstrates:

Classes and objects
Constructors
Encapsulation using private fields
Interfaces and polymorphism
Arrays for data storage
Method design
User input validation
Formatted output using printf
Possible Future Improvements

Some ideas for expanding the project:

Add credit/debit card payments
Save inventory to a file
Add admin restocking mode
Use ArrayLists instead of arrays
Add item categories
Add GUI support with JavaFX or Swing
Add transaction history

Author

Keenan Roberts
Assignment 10 - Vending Machine
Date: 5/6/2026