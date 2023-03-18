package ID_Lab3_1;



public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(200,"A001","Mr.A");
        System.out.println("New balance of your account is "+account1);
        account1.withdraw(20);
        System.out.println("New balance (after withdraw) of your account is "+account1);

        BankAccount account2 = new BankAccount(50000,"A002","Mr.B");
        System.out.println("New balance of your account is "+account2);
        account2.deposit(20000);
        System.out.println("New balance (after deposit) of your account is "+account2);

        BankAccount account3 = new BankAccount(500,"A003","Mr.C");
        System.out.println("New balance of your account is "+account3);
        account3.deposit(50);
        System.out.println("New balance (after withdraw) of your account is "+account3);

        // BankAccount.totalAccount = 5 ;
        System.out.println("Number of account is " + BankAccount.totalAccount + " accounts");
        // System.out.println("Number of account is " + account1.numAccount + " accounts");

    }
}
