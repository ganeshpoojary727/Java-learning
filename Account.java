/*Challenge: "The Mini Bank" 🏦
Scenario: You are building a banking system. All accounts belong to the same bank ("Java Bank"), but every user has their own balance.

1. Create a class Account:

Static Variable: String bankName = "Java Bank" (Shared by everyone).

Instance Variables: String holderName, double balance.

Constructor: Takes (String name, double amt) and uses this to save them.

Method 1 (deposit): Takes a double amount. Adds it to the balance. Prints: "Deposited [amount] into [holderName]'s account."

Method 2 (showInfo): Prints: "Bank: [bankName] | User: [holderName] | Balance: $[balance]".

2. Create a Main class:

The Array: Create an Account[] array of size 3.

The Setup (Loop 1): Use a for loop to ask the user for a Name and Initial Balance for 3 people. Create the objects (new Account(...)) and store them in the array.

The Action (Loop 2): Loop through the array again.

Deposit $100 into everyone's account (using your method).

Call showInfo() for everyone.*/
import java.util.Scanner;
public class Account {
    static String bankName="Java Bank";
    String holdername;
    double balance;
Account(String holdername,double balance){
this.holdername=holdername;
this.balance=balance;
}
public void deposit(double amount){
balance+=amount;
System.out.println("Deposited"+amount+"into" +holdername+"'s account.");
}
public void showInfo(){
    System.out.println("|Bank:"+bankName+"|User:"+holdername+"|Balance: $"+balance);
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     Account[] array=new Account[3];
     for(int i=0;i<3;i++){
        System.out.println("Enter the name:");
        String tempname=sc.nextLine();
        System.out.println("Enter the amount to be deposited:");
        int tempamount=sc.nextInt();
        array[i]=new Account(tempname,tempamount);
        sc.nextLine();
     }
for(int i=0;i<3;i++){
    array[i].deposit(100);
    array[i].showInfo();
}
sc.close();
}
}