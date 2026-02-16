public class area {
    double dm1,dm2;
    area(double dm1,double dm2){
        this.dm1=dm1;
        this.dm2=dm2;
    }
    void calculateArea(){
        System.out.println("Undefined Shape Area");
}
public static void main(String[] args) {
        Rectangle rect=new Rectangle(10,5);
        Triangle tri=new Triangle(10,5);
        rect.calculateArea();
        tri.calculateArea();
    }
}
class Rectangle extends area{
    Rectangle(double length,double width){
        super(length,width);
    }
    @Override
    void calculateArea(){
         double area = dm1 * dm2;
         System.out.println("The area of Rectangle is:"+area);
    }
}
class Triangle extends area{
    Triangle(double base,double height){
        super(base,height);
    }
    @Override
    void calculateArea(){
         double area = 0.5 * dm1 * dm2;
         System.out.println("The area of Triangle is:"+area);
    }
}