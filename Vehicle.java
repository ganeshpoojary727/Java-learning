public class Vehicle {
    String brand;
    double price;
    Vehicle(String brand,double price){
        this.brand=brand;
        this.price=price;
    }
    void displayInfo(){
       System.out.println("|Brand:"+brand+"|Price: $"+price);
    }
}
    class Car extends Vehicle{
        public int doors;
        Car(String brand, double price,int doors){
            super(brand,price);
            this.doors=doors;
        }
        void honk(){
            System.out.println("Honk! Honk!....");
        }
    }
    class Bike extends Vehicle{
        public boolean hasGear;
        Bike(String brand, double price,boolean hasGear){
            super(brand,price);
            this.hasGear=hasGear;
        }
        void Wheelie(){
            System.out.println("doing a wheelie");
        }
    public static  void main (String[] args){
        Bike bike_obj=new Bike("Yamaha", 1500, true);
        Car Car_obj=new Car("Toyota", 25000, 4);
        bike_obj.displayInfo();
        Car_obj.displayInfo();
        Car_obj.honk();
        bike_obj.Wheelie();
    }
}
