/*Mini-Challenge: "The Animal Kingdom"
Your Task:

Create a parent class Animal.

Attribute: String name

Method: void eat() (Prints "Animal is eating...")

Create a child class Dog that extends Animal.

Method: void bark() (Prints "Woof Woof!")

In main:

Create a Dog object.

Give it a name.

Call .eat() (The inherited action).

Call .bark() (The special action).*/
public class Animal {
    String name;
void eat(){
    System.out.println("Animal is eating");
}
}
class dog extends Animal{
    void bark(){
        System.out.println("woof woof!");
    }
    public static void main(String[] args) {
        dog bob=new dog();
        bob.name="BOB";
        bob.eat();
        bob.bark();
    }
}