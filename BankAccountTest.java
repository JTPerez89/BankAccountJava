public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(100.0);
        BankAccount account3 = new BankAccount(50.0, 50.0);

        System.out.println(account1.getCheckings());
        System.out.println(account1.getSavings());
        System.out.println(account2.getCheckings());
        System.out.println(account2.getSavings());
        System.out.println(account3.getCheckings());
        System.out.println(account3.getSavings());

        account1.depositIntoCheckings(150.0);
        account2.depositIntoCheckings(80.0);
        account3.depositIntoCheckings(25.0);
        account1.depositIntoSavings(150.0);
        account2.depositIntoSavings(80.0);
        account3.depositIntoSavings(25.0);

        System.out.println(account1.getCheckings());
        System.out.println(account1.getSavings());
        System.out.println(account2.getCheckings());
        System.out.println(account2.getSavings());
        System.out.println(account3.getCheckings());
        System.out.println(account3.getSavings());

        System.out.println(BankAccount.getBankTotal());

        account1.withdrawlFromCheckings(150.0);
        account2.withdrawlFromCheckings(80.0);
        account3.withdrawlFromCheckings(25.0);
        account1.withdrawlFromSavings(150.0);
        account2.withdrawlFromSavings(80.0);
        account3.withdrawlFromSavings(25.0);

        System.out.println(account1.getCheckings());
        System.out.println(account1.getSavings());
        System.out.println(account2.getCheckings());
        System.out.println(account2.getSavings());
        System.out.println(account3.getCheckings());
        System.out.println(account3.getSavings());

        System.out.println(BankAccount.getBankTotal());

        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());
        System.out.println(account3.getAccountNumber());
    }
}