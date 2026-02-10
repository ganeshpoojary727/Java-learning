/*⚡ Mini-Challenge: "The Even Checker"
Your Task:

Create a class Checker.java.

Write a method outside main called isEven.

Input: One int.

Return Type: boolean.

Logic: Return true if the number is even, false otherwise.

Inside main, use a Scanner to get a number from the user, pass it to your method, and print "Even" or "Odd" based on the result.*/
import java.util.Scanner;
public class checker {
    
    public static boolean even(int b){
        boolean value;
        int rem=b%2;
        if(rem==0){
            value=true;
        }
        else{
            value=false;
        }
        return value;
    }
        public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the number to be checked");
              int a=sc.nextInt();
              
              System.out.println("The number is even"+even(a));
        }
    
}
