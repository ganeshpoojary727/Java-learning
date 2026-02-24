import java.util.ArrayList;
public class class123 {
    public static void main(String[] args) {
        ArrayList<Integer> rawNumbers=new ArrayList<>();
         ArrayList<Integer> evenNumbers=new ArrayList<>();
        rawNumbers.add(15);
        rawNumbers.add(22);
        rawNumbers.add(8);
        rawNumbers.add(97);
        rawNumbers.add(44);
        for(int n:rawNumbers){
            if(n%2==0){
                evenNumbers.add(n);
            }
        }
        for(int n:evenNumbers){
            System.err.println("Even numbers:"+n);
        }
    }
}
