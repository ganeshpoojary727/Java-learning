/*Create a class called Login.java.
Hardcode a "correct" password in a variable: String correctPass = "SDMIT2026";.
Use Scanner to ask the user to "Enter Lab Password: ".
Use an if-else block to check the input.
If they match: Print "Access Granted, Ganesh!"
If they don't: Print "Access Denied!"
*/
import java.util.Scanner;
public class login {
    
    public static void main(String[] args) {
        String correctpass="SDMIT123";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the password for the login");
        String pass=s.nextLine();
        if(pass.equals(correctpass)){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }
    }
}
