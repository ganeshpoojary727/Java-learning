public class class2 {
    public static void main(String[] args) {
        Duck dk=new Duck();
        dk.swim();
        dk.fly();
    }
}
interface  Swimmer{
    void swim();
}
interface  Flyer{
    void fly();
}
class Duck implements Swimmer,Flyer{
 public void swim(){
    System.out.println("im swimming");
 }
 public void fly(){
    System.out.println("im flying ");
 }
}