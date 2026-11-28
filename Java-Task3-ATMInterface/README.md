# ATM Interface (Java)

This is my Java console-based ATM Interface project for **Task 3** of the Oasis Infobyte Java Development Internship.

The application allows users to log in using their User ID and PIN and perform basic banking operations.

## Features

- User login with User ID and PIN.
- Maximum 3 incorrect login attempts.
- Check account balance.
- Deposit money with amount validation.
- Withdraw money with sufficient balance validation.
- Transfer money between accounts.
- Transaction history using `ArrayList`.
- Separate transaction records for sender and receiver.
- Account validation and self-transfer prevention.
- Exit option with a goodbye message.

## Built With

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner

## Project Structure

```text
Java-Task3-ATMInterface/
├── src/
│   ├── Main.java
│   ├── ATM.java
│   ├── Account.java
│   ├── Bank.java
│   └── Transaction.java
├── screenshots/
└── README.md
```

## How to Run

Make sure Java JDK is installed.

Open a terminal inside the `src` folder and run:

```bash
javac *.java
java Main
```

## Screenshots

### 1. Login and Balance Check

![Login and Balance](screenshots/1_login+balance.png)

### 2. Deposit and Withdrawal

![Deposit and Withdrawal](screenshots/2_deposit+withdraw.png)

### 3. Transaction History

![Transaction History](screenshots/3_transaction-history.png)

### 4. Money Transfer and Exit

![Money Transfer and Exit](screenshots/4_money-transfer+exit.png)

### 5. Invalid User ID or PIN

![Invalid Login](screenshots/5_invalid-user-or-pin.png)

### 6. Invalid Amount

![Invalid Amount](screenshots/6_invalid-Amount.png)

### 7. Insufficient Balance

![Insufficient Balance](screenshots/7_Insufficient-Balance.png)

## Note

This project stores account balances and transaction history in memory. Data resets when the application is restarted.

---

**Internship:** Oasis Infobyte – Java Development  
**Task:** Task 3 – ATM Interface  
**Developer:** Nikhil Parmar.