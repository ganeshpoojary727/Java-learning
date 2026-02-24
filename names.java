import java.util.ArrayList;
public class names{
    public static void main(String[] args) {
        ArrayList<String> wrongList= new ArrayList<>();
        ArrayList<String> correctList= new ArrayList<>();
        wrongList.add("David");
        wrongList.add("Charlie");
        wrongList.add("Bob");
        wrongList.add("Alice");
        for(int i=wrongList.size()-1;i>=0;i--){
         correctList.add(wrongList.get(i));
        }
        for(String name:correctList){
            System.out.println(name);
        }
    }
}