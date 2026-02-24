public class exception {
    public static void main(String[] args) {
int[] myNumbers={10,20,30};
try {
    System.out.println(myNumbers[10]);
} catch (Exception e) {
    System.err.println("Oops! That index doesn't exist. Error caught!"+e);
}
System.out.println("Program finished successfully.");
    }
}