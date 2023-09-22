# AccountM
The PersonalAccount class is a Java program designed to represent a personal bank account. It provides functionality to manage account transactions, including deposits, withdrawals, and transaction history tracking.
Allows users to deposit funds into the account. It checks if the provided amount is greater than 0.0, and if so, it adds a new Amount object to the transaction history with the type "Deposit" and updates the account balance accordingly. A message is printed to indicate the successful deposit or an "Invalid" message if the amount is not valid.

withdraw(double amount): Allows users to withdraw funds from the account. It checks if the provided amount is greater than 0.0 and does not exceed the account balance. If the conditions are met, it adds a new Amount object to the transaction history with the type "Withdrawal" and updates the account balance. A message is printed to indicate the successful withdrawal or an "Invalid" message if the withdrawal is not valid.
