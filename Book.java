import java.util.Scanner;
public class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price; 
    }
    public void applyDiscount(double percentage) {
        this.price = this.price - (this.price * percentage / 100);
        System.out.println("Discount applied! New price calculated.");
    }
    public void printInfo() {
        System.out.println("Title: " + this.title + " | Price: $" + this.price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] bookobj = new Book[3];
        System.out.println("Enter the title and price of the 3 books:");
        for (int i = 0; i < bookobj.length; i++) {
            System.out.println("Enter Title for Book " + (i + 1) + ":");
            String tempTitle = sc.nextLine(); 
            System.out.println("Enter Price:");
            double tempPrice = sc.nextDouble(); 
            sc.nextLine(); 

            bookobj[i] = new Book(tempTitle, tempPrice);
        }

        System.out.println("\n--- Applying 10% Discount ---");
        for (int i = 0; i < bookobj.length; i++) {
            bookobj[i].applyDiscount(10.0); 
            bookobj[i].printInfo();         
        }
    }
}