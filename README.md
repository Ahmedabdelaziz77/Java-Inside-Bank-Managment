# Java Banking Management System

A comprehensive banking system designed for managing various banking operations such as deposits, withdrawals, account management, and more. The system differentiates between users and employees, providing enhanced functionalities and services for employees. This project uses **Java** and **Java Swing** for the user interface and provides a secure and user-friendly platform for managing banking tasks.

---

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

---

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

---

## Database Details

The system uses a MySQL database named **`atmdb`**, which contains the following three tables:

### 1. **`accounttbl`**
- Stores user account details such as account number, balance, and PIN.
- **Schema:**
  ```sql
  CREATE TABLE accounttbl (
      AccNum INT(200) PRIMARY KEY,
      AccName VARCHAR(200),
      FName VARCHAR(200),
      Dob VARCHAR(200),
      Phone VARCHAR(200),
      Address VARCHAR(200),
      Education VARCHAR(200),
      Occupation VARCHAR(200),
      Balance INT(200),
      PIN INT(200)
  );


### 2. **`employee`**
- Contains information about employees, including employee IDs and access levels.
- - **Schema:**
  ```sql
  CREATE TABLE employee (
    name VARCHAR(200),
    password VARCHAR(200),
    accnum INT(200),
    phone INT(200),
    address VARCHAR(200),
    balance INT(200)
);

### 3. **`transactiontbl`**
- Records all transactions made by users, such as deposits, withdrawals, and transfers.
- - **Schema:**
  ```sql
  CREATE TABLE transactiontbl (
      Tid INT(200) PRIMARY KEY,
      AccNum INT(200),
      Type VARCHAR(200),
      TDate VARCHAR(200),
      Amount INT(200)
  );

![accounttbl](https://github.com/user-attachments/assets/49e0e559-b4b2-44e3-a906-f012e507c84f)
![employee](https://github.com/user-attachments/assets/c71b28e4-7918-4b95-829b-e1eff202eaa5)
![transactiontbl](https://github.com/user-attachments/assets/dfde9b13-dd7a-4e37-b6df-2a587fa1a374)

### **Database Connection**
The database connection is managed in the `MyDb.java` file. Update the credentials in the file to match your local setup:

```java
String url = "jdbc:mysql://localhost:3306/atmdb";
String username = "root";
String password = "";
```


### Prerequisites

Before running the project, ensure you have the following installed:

1. **Java Development Kit (JDK):** Version 8 or higher.
2. **MySQL Server:** Version 8.0 or higher.
3. **MySQL Connector/J:** The latest connector for Java.
4. **AbsoluteLayout-RELEASE230.jar:** Ensure this JAR file is included in your project dependencies.

## Running the Project

Follow these steps to set up and run the project:

1. **Clone the Project:**  
   Clone the project repository to your local machine.

2. **Compile and Run Java Files:**  
   Use your preferred IDE or terminal to compile the Java files.

3. **Create the Database:**  
   Create a database named `atmdb` in your MySQL server.

   ```sql
   CREATE DATABASE atmdb;
   ```

5. **Set Up Tables:**  
   Use the provided SQL schema files to create the necessary tables in the `atmdb` database.

6. **Run the Application:**  
   - Compile all Java files.
   - Start the application by running `FirstPage.java`.

Enjoy using the ATM Management System!




 ## Demos

  #### Video Demo Link => [here](https://drive.google.com/file/d/1pegLWJED8HIibfFaJ7Q9tBitDBI8yAOk/view?usp=drive_link)https://drive.google.com/file/d/1pegLWJED8HIibfFaJ7Q9tBitDBI8yAOk/view?usp=drive_link) 
   


