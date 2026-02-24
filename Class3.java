import java.util.ArrayList;

public class Class3 {
    
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        
        scores.add(100);
        scores.add(250); 
        scores.add(50);  
        
        scores.set(2, 500);
        
        System.out.println(scores); 
    }
}