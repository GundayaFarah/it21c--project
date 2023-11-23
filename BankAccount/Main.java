
package oopbankaccount;

public class Main {

    public static void main(String[] args) {
       BankAccount account= new BankAccount("Farah Gundaya", 22, 492847218, 280.0);
        
        account.deposit(344.0);
       account.deposit(555.0);

        
        System.out.println(account.getSummary());
    }
}
