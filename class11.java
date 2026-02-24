import java.util.ArrayList;
public class class11 {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();
        int maxscore=0;
        scores.add(85);
        scores.add(78);
        scores.add(92);
        scores.add(99);
        for(int n:scores){
            if(n>maxscore){
                maxscore=n;
            }
            System.out.println(n);
        }
        System.out.println("Maximum Score:"+maxscore);
    }
}
