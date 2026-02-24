/*Create a class with a main method.

Import java.util.HashMap.

Create a HashMap where the Key is a String (Employee Name) and the Value is an Integer (Employee ID). Name it companyRoster.

Use .put() to add these three employees:

"Sarah", ID: 104

"John", ID: 208

"Mike", ID: 512

John lost his ID badge. Create an int variable called johnsId and use .get("John") to retrieve his number.

Print: "John's ID is: " + johnsId. */
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> companyRoster=new HashMap<>();
        companyRoster.put("Sarah", 104);
        companyRoster.put("John", 208);
        companyRoster.put("Mike", 512);
        int id=companyRoster.get("John");
        System.out.println(id);
    }
}
