public class BankAccount {
    private long accountNumber;
    private double checkingsBalance;
    private double savingsBalance;
    private static int totalAccounts = 0;
    private static double totalBalanceInBank = 0;

    public BankAccount() {
        this.accountNumber = randomAccountNumber();
        this.checkingsBalance = 0;
        this.savingsBalance = 0;
        totalAccounts++;
    }

    public BankAccount(double checkings) {
        this.accountNumber = randomAccountNumber();
        this.checkingsBalance = checkings;
        this.savingsBalance = 0;
        totalAccounts++;
        totalBalanceInBank += checkings;
    }

    public BankAccount(double checkings, double savings) {
        this.accountNumber = randomAccountNumber();
        this.checkingsBalance = checkings;
        this.savingsBalance = savings;
        totalAccounts++;
        totalBalanceInBank += checkings + savings;
    }
    
    public double getCheckings() {
        return this.checkingsBalance;
    }

    public double getSavings() {
        return this.savingsBalance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public static double getBankTotal() {
        return totalBalanceInBank;
    }

    public void depositIntoCheckings(double amount) {
        this.checkingsBalance += amount;
        totalBalanceInBank += amount;
    }

    public void depositIntoSavings(double amount) {
        this.savingsBalance += amount;
        totalBalanceInBank += amount;
    }

    public void withdrawlFromCheckings(double amount) {
        if(amount <= this.checkingsBalance){
            this.checkingsBalance -= amount;
            totalBalanceInBank -= amount;
        } else {
            System.out.println("insufficient funds.");
        }
    }

    public void withdrawlFromSavings(double amount) {
        if(amount <= this.savingsBalance){
            this.savingsBalance -= amount;
            totalBalanceInBank -= amount;
        } else {
            System.out.println("insufficient funds.");
        }
    }

    private long randomAccountNumber() {
        long account = (long) Math.floor((Math.random() * 9999999999L) + 1000000000L);
        return account;
    }

}