/*Your Task: Create a program called StudentList.java.

Create an ArrayList of Strings.

Use a Scanner to ask the user to input 3 names of their classmates.

Use a loop (just like in C/Python) to add them to the list.

Print the final list.*/
import java.util.ArrayList;
import java.util.Scanner;

public class studentlist { // Class name capitalized (standard convention)
    public static void main(String[] args) {
        ArrayList<String> classmates = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Students");
            System.out.println("2. Remove Student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            // ERROR 1 FIX: Use 'sc.' to call the method
            int ch = sc.nextInt(); 
            sc.nextLine(); // BUFFER FIX: Consumes the newline after the choice number

            if (ch == 1) {
                System.out.println("Enter the no of students:");
                int n = sc.nextInt();
                sc.nextLine(); // BUFFER FIX: The "Vacuum" line! Consumes the newline after 'n'

                System.out.println("Enter the " + n + " names:");
                // ERROR 4 FIX: Use 'i < n' to loop exactly n times
                for (int i = 0; i < n; i++) {
                    String name = sc.nextLine(); // Reads the name
                    classmates.add(name);
                }
            } 
            else if (ch == 2) {
                System.out.println("Enter the name to remove:");
                // ERROR 2 FIX: Redeclare 'name' here because the other one is dead
                String name = sc.nextLine(); 
                classmates.remove(name);
                System.out.println(name + " removed.");
            } 
            else if (ch == 3) {
                System.out.println("Exiting...");
                System.exit(0); // ERROR 5 FIX: It's System.exit(), not just exit()
            } 
            else {
                System.out.println("Invalid choice");
            }
            
            // Let's print the list at the end of every loop so we can see updates
            System.out.println("Current Classmates: " + classmates);
        }
    } 
}