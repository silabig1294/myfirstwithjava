package ID_Lab3_1;
//inheritance super class
public class BankAccount extends BankInfo{
    public BankAccount(double amount,String id,String name){
        AccountName(name);
        AccountID(id);
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
        return super.toString()+" Balance= "+balance;
    }
    private double balance;
    public static int totalAccount = 0;
    public int  numAccount = 0;

}

