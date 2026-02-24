abstract class Appliance{
    void PlugIn(){
        System.out.println("Electricity connected.");
    }
    abstract void  turnOn();
}
class WashingMachine extends Appliance{
    void turnOn(){
        System.out.println("Washing clothes...");
    }
}
class Microwave extends Appliance{
        void turnOn(){
            System.out.println("Heating food...");
        }
    }
public class Main1 {
    public static void main(String[] args) {
        WashingMachine mc=new WashingMachine();
        Microwave mv=new Microwave();
        mc.turnOn();
        mv.turnOn();
        
    }
}
