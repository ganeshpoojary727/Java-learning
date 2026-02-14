/*Now that you see Scanner is just another object like Car, let's go back to the Smart Phone Challenge.

Remind me:

Class: Phone

Attributes: model (String), battery (int)

Method: charge() (sets battery to 100)

Can you write the code for Phone and make it work in main?*/
class phone {
String model="samsung";
int battery=60;
public void charge(){
    battery=100;
}
public static void main(String[] args){
    phone newphone=new phone();
    
    newphone.model="Moto";
    newphone.charge();

    System.out.println("new model\t"+newphone.model);
    System.out.println("battery after charging\t"+newphone.battery);
}
}