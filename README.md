# Java Banking Management System

A comprehensive banking system designed for managing various banking operations such as deposits, withdrawals, account management, and more. The system differentiates between users and employees, providing enhanced functionalities and services for employees. This project uses **Java** and **Java Swing** for the user interface and provides a secure and user-friendly platform for managing banking tasks.

## Features

### User Features
- **Balance Inquiry:** Check account balance.
- **Change PIN:** Securely change your account PIN.
- **Deposit Funds:** Deposit money into your account.
- **Withdraw Funds:** Withdraw money from your account.
- **Mini Statement:** View recent transactions.
- **Information Display:** View various account details.

### Employee Features
- **All User Services:** Employees can perform all the user functionalities such as deposit, withdrawal, balance inquiry, etc.
- **Account Management:** Employees can manage user accounts, including viewing and modifying account details.
- **Authorization:** Provides authorization for different levels of access to banking services for employees.

### Database and Security
- **User & Employee Separation:** Differentiate between users and employees, providing special access rights to employees.
- **User Registration (Sign Up):** New users can register and create accounts.
- **Authorization for Sensitive Operations:** Employees are authorized to access and perform sensitive operations like withdrawals, deposits, and account management.
- **Password Recovery:** Forgotten passwords can be reset via a secure process.

## Project Structure

The project consists of multiple Java classes, each responsible for handling different functionalities:

- **Balance.java:** Manages balance inquiries and updates for user accounts.
- **ChangePin.java:** Handles the process of changing a user's PIN for enhanced security.
- **ChooseService.java:** Provides a menu or interface for users to select various banking services.
- **ChooseUser.java:** Allows the selection of different users in the banking system, possibly for operations like sign-in or account management.
- **Deposit.java:** Manages the process of depositing funds into a user's account.
- **FastCash.java:** Facilitates quick cash withdrawals, likely through predefined amounts to speed up transactions.
- **FirstPage.java:** Serves as the entry point of the application, displaying the initial user interface.
- **Informations.java:** Displays various informational messages or account details to the user.
- **MiniStatement.java:** Provides a summarized view of recent transactions for a user, similar to a bank statement.
- **MainMenu.java:** Acts as the central menu from which users can navigate to different functions of the banking system.
- **MyDb.java:** Manages database connections and interactions for storing and retrieving user data and transactions.
- **SignUp.java:** Handles user registration, including creating new accounts within the system.
- **Withdraw.java:** Manages fund withdrawal processes from user accounts.
- **ForgetPassword.java:** Implements functionalities for users to recover or reset their forgotten passwords.
- **Log.java:** Keeps a record of user activity or transactions for audit or troubleshooting purposes.

## Challenge & Enhancements

The challenge involved in this project includes:
- **Adding New Users & Employees:** Adding new users to the system and differentiating between normal users and employees, as employees have access to a wider range of services.
- **Authorization for Services:** Ensuring that employees are authorized to access all types of services like withdrawing, depositing, and viewing account information.
- **User Role Differentiation:** Ensuring that employees can perform all banking operations while users have more restricted access.

## Built With

- **Java** - The core language used to build the banking system.
- **Java Swing** - Used for creating the user interface and managing interactions within the banking system.

## Getting Started

To get started with the banking management system:
### Prerequisites
- Install **Java Development Kit (JDK)** on your machine.
- Ensure that **Java Swing** is available for UI components.

### Running the Project
1. Clone the repository to your local machine.
2. Compile and run the Java files in the project.
3. Start with the `FirstPage.java` to launch the application.

```bash
git clone https://github.com/your-username/Java-Inside-Bank-Management.git
cd Java-Inside-Bank-Management
javac *.java
java FirstPage
