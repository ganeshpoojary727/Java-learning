/*Your Task:
Create a class GradeCalc.java with two specific methods (besides main):

Method 1: getPercentage

Input: Two integers: totalMarks (e.g., 450) and maxMarks (e.g., 500).

Logic: Calculate the percentage: (totalMarks / maxMarks) * 100.

Return: A double (the percentage).

Hint: Watch out for Integer Division! Cast one to double.

Method 2: isPass

Input: A double (the percentage).

Logic: Return true if percentage >= 40. Return false otherwise.

Return: boolean.

The main Method:

Ask user for "Total Marks Scored" and "Maximum Possible Marks".

Call getPercentage.

Call isPass.

Print: "Percentage: [X]%" and "Result: [Pass/Fail]".*/
import java.util.Scanner;
public class GradeCalc {
    public static boolean isPass(double marks, double maxMarks) {
        double percentage = (marks / maxMarks) * 100;
        return percentage >= 40; 
    }

    public static double getPercentage(double totalScored, double totalMax) {
        return (totalScored / totalMax) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();
        
        System.out.println("Enter Max Marks per subject:");
        double maxPerSubject = sc.nextDouble();

        double totalScored = 0;
        double totalMax = n * maxPerSubject;

        System.out.println("Enter marks for " + n + " subjects:");

        for (int i = 0; i < n; i++) {
            double marks = sc.nextDouble();

            boolean passedSubject = isPass(marks, maxPerSubject);

            if (!passedSubject) { // The '!' means NOT. So "If NOT passed..."
                System.out.println("❌ Failed in subject " + (i + 1) + " (Score: " + marks + ")");
                System.out.println("Result: FAIL");
                System.exit(0); // Stop immediately
            }
            totalScored += marks;
        }
        double finalPercent = getPercentage(totalScored, totalMax);
        
        System.out.println("\n--- FINAL RESULT ---");
        System.out.println("Total: " + totalScored + " / " + totalMax);
        System.out.println("Percentage: " + finalPercent + "%");
        System.out.println("Result: PASS ✅");
    }
}