package FInal;
import java.util.ArrayList;
import java.util.HashMap;
interface Notifier{
    public void sendAlert(String message);
}
abstract class Account{
    int balance;
    ArrayList<String> history;
    Account(){
        this.balance=0;
        this.history=new ArrayList<>();
    }
    void Deposit(int amount){
        balance = balance + amount;
        history.add("Deposited: " + amount);
         System.out.println("Deposited: " + amount);
    }
   abstract  void withdraw(int amount);
    }
    class SavingsAccount extends Account implements Notifier {
        @Override
        public void sendAlert(String message){
            System.out.println("🚨 BANK ALERT: " + message);
        }
        void withdraw(int amount){
           if(amount>balance){
            sendAlert( "Insufficient funds!");
        }
        else{
            balance-=amount;
            history.add("Withdrew: $" + amount);
        }
        }
    }
public class Main33 {
    public static void main(String[] args) {
        HashMap<String, SavingsAccount> db = new HashMap<>();
        SavingsAccount aliceAccount=new SavingsAccount();
        db.put("Alice", aliceAccount);
        try{
            db.get("Alice");
            SavingsAccount activeUser = db.get("Alice");
            activeUser.Deposit(500);
            //activeUser.withdraw(1000);
            SavingsAccount fakeuser=db.get("Bob");
            fakeuser.withdraw(100);
}
catch(NullPointerException e){
System.err.println("SECURITY ERROR: Account does not exist!");
}
finally{
    System.out.println("Bank system shutting down. Have a nice day.");
}
    }
}
