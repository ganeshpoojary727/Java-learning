import java.util.Scanner;
public class User {
    private String username,password;
    User(String username,String password){
        this.username=username;
        this.password=password;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String newPass){
        if(newPass.length()>6){
            password=newPass;
        }
        else{
            System.out.println("Password too weak!");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        User usr=new User("Ganesh","1234");
        System.out.println("Your User Name:"+usr.username+"password:"+usr.password);
        System.out.println("Enter the new password:");
        String temppass=sc.nextLine();
        usr.setPassword(temppass);

    }
}
