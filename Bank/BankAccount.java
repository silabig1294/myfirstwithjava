package Bank;

public class BankAccount {
    public BankAccount(double amount){
        totalAccount++;
        balance = amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public String toString(){
        return "Balance= "+balance;
    }
    private double balance;
    public static int totalAccount = 0;
    public int  numAccount = 0;

}

