package dayFive;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        if(initialBalance < 0){
            System.out.println("Initial balance can not be negative set balance to 0");
        }
        balance = initialBalance;
    }

    public void deposit (double amount){
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    public double getBalance(){
        System.out.println("The balance is " + balance);
        return balance;
    }
}
