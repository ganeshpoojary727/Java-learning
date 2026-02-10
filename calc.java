import java.util.Scanner;
public class calc {
    public static void main(String[] args){
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter Your name:");
           String name=sc.nextLine();
           System.out.println("Enter the first number:");
           int num1=sc.nextInt();
           System.out.println("Enter the Second number:");
           int num2=sc.nextInt();
           int sum=num1+num2;
           System.out.println("Hey"+name+" the result is"+sum);
    }
}
