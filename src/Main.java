// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {    public Main() {
}
    public static void main(String[] args) {        PersonalAccount amira = new PersonalAccount(220104031, "Amira");
        new PersonalAccount(220104003, "Akylai");        amira.deposit(300.0);
        amira.withdraw(200.0);        amira.printTransactionHistory();
    }}