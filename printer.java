public class printer {
    void print(String text){
        System.out.println("The String is:"+text);
    }
   void  print(int number){
         System.out.println("The number is:"+number);
    }
    void print(String text,int number){
        System.out.println("The String is:"+text+"The number is:"+number);
    }
public static void main(String[] args) {
    printer p=new printer();
    p.print("hello");
    p.print(5);
    p.print("hello",5);
}
}
