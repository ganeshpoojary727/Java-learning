/*Scenario: You are building a tool to track your daily spending.
Requirements:
Class Name: ExpenseTracker.java
Data Structure: Use an ArrayList<Double> to store expense amounts.
Input Loop (in main):
Ask the user to enter an expense amount.
If they enter 0, stop the loop.
Otherwise, add the amount to the list.
Method 1: calculateTotal
Input: The ArrayList.
Logic: Loop through the list and sum up all numbers.
Return: The total sum (double).
Method 2: checkBudget
Input: The total sum (double).
Logic: If the total is > 1000, print "Over Budget! 🚨". Else, print "Within Budget ✅".
Return: void (just prints).
Final Output:
After the loop ends, print:
All expenses in the list.
The Total Sum (using your method).
The Budget Status (using your method).*/
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {

    // METHOD 1: Calculates the total (Returns a double)
    // Notice the parameter: It takes the whole ArrayList as input!
    public static double calculateTotal(ArrayList<Double> list) {
        double total = 0;
        // The "For-Each" Loop (Java's version of Python's 'for x in list')
        for (double amount : list) {
            total += amount;
        }
        return total;
    }

    // METHOD 2: Checks the budget (Returns void, just prints)
    public static void checkBudget(double total) {
        if (total > 1000) {
            System.out.println("Status: Over Budget! 🚨");
        } else {
            System.out.println("Status: Within Budget ✅");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> expenses = new ArrayList<>(); // Note: Capital 'D' Double

        System.out.println("Enter expenses (type 0 to stop):");

        while (true) {
            double amount = sc.nextDouble();
            
            if (amount == 0) {
                break; // Stop the loop
            }
            expenses.add(amount); // Add to list
        }

        // 1. Calculate
        double myTotal = calculateTotal(expenses);

        // 2. Print Results
        System.out.println("\n--- SUMMARY ---");
        System.out.println("Expenses: " + expenses);
        System.out.println("Total Spent: " + myTotal);
        
        // 3. Check Budget
        checkBudget(myTotal);
    }
}
