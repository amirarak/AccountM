public class Main {    public static void main(String[] args)
{
    PersonalAccount amira = new PersonalAccount(220104031, "Amira");
    new PersonalAccount(220104003, "Akylai");
    try {
        amira.deposit(300);
        amira.withdraw(500);
        } catch (InsufficientBalanceException e) {
        System.out.println("Error: " + e.getMessage());
    }
    amira.printTransactionHistory();
}
}