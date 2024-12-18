# TBMS
school project

Design and implement a that incorporates user authentication, tiered privileges for different account types, and complex transaction rules. The system must allow user to register accounts, perform tier-specific banking operations, and manage transactions securely. All operations must validate user inputs and enforce account-specific rules.  

Requirements:

1. USER REGISTRATION AND AUTHENTICATION
Each user must register with USERNAME &  PIN (4 DIGITS)
Users can log in using their credentials to access their account.
If a user enters incorrect credentials three times, lock the account and display:
"Account locked due to multiple failed login attempts."
  2. Users must choose an account type during registration:

SAVINGS ACCOUNT
Minimum balance: 1000.
Withdrawal limit: 20,000 per day.
Interest rate: 3% annually, calculated on-demand.
CURRENT ACCOUNT
Minimum balance: 5000.
No withdrawal limit.
No interest rate.
3. SYSTEM FEATURES
MENU SYSTEM - After login, the system displays the menu:
**************************************************************************
Welcome to the Multi-Tier Bank Account Management System 
              1. Check Balance               
              2. Deposit Money 
              3. Withdraw Money  
              4. Calculate Interest (Savings Only) 
              5. Logout 
              Enter your choice:

 **************************************************************************
CHECK BALANCE : Display the user's current balance.

DEPOSIT MONEY:
    Ask for the deposit amount and validate:
    Must be positive.
    Update balance and transaction log.
WITHDRAW MONEY:

Validate the withdrawal:
Must be positive.
Savings accounts cannot exceed the daily limit or fall below the minimum balance.
For current accounts, ensure the balance remains above the minimum.
Update balance.
CALCULATE INTEREST(SAVINGS ONLY):
If the user has a Savings account, calculate interest based on their balance and display:
"Interest earned: [calculated amount]"
If the user has a Current account, display:
"This feature is not available for Current accounts."
LOGOUT:
Return the user to the login screen.
SESSION MANAGEMENT
Prevent access to features without login.
DYNAMIC MENU
Disable "Calculate Interest" for Current account users.
SECURITY FEATURES
Lock accounts after 3 failed login attempts.
******************************************************REGISTRATION*******************************************************
Welcome to the Multi-Tier Bank Account Management System
1. Register
2. Login
3. Exit
Enter your choice: 1

Enter a username: johndoe
Enter a 4-digit PIN: 1234
Choose account type:
1. Savings
2. Current
Enter your choice: 1

Enter your initial deposit: 500
Invalid deposit. Minimum balance for a Savings account is 1000.

Enter your initial deposit: 2000
Registration successful!

*************************************************************************************************************************

***********************************************************LOGIN *******************************************************
Welcome to the Multi-Tier Bank Account Management System
1. Register
2. Login
3. Exit
Enter your choice: 2

Enter username: johndoe
Enter PIN: 1234
Login successful!

*************************************************************************************************************************
***********************************************************POST LOGIN MENU ******************************************
Welcome, johndoe
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Calculate Interest (Savings Only)
5. Logout
Enter your choice: 1

Your current balance is: 2000

*************************************************************************************************************************

***********************************************************FAILED LOGIN******************************************
Enter username: johndoe
Enter PIN: 1111
Incorrect credentials. Try again.

Enter username: johndoe
Enter PIN: 2222
Incorrect credentials. Try again.

Enter username: johndoe
Enter PIN: 3333
Account locked due to multiple failed login attempts.

*************************************************************************************************************************
**********************************************CALCULATE INTEREST(SAVINGS)******************************************
Enter your choice: 5
Interest earned: 60.0

*************************************************************************************************************************
**************************************INVALID ACCESSS (CURRENT ACCOUNT)******************************************
Enter your choice: 5
This feature is not available for Current accounts.

*************************************************************************************************************************
