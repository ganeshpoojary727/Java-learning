public class Minefield {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 0};
        int result;
        try {
            for(int i=0;i<numbers.length-1;i++){
                result=numbers[i]/numbers[i+1];
                System.out.println(result);
        } }catch (ArithmeticException e) {
            System.err.println("Math Error: Cannot divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException e) { 
                System.err.println("Array Error: That index is missing!");
            }
            catch (Exception e) { 
                System.err.println("Unknown Error caught!");
             }
        }
    }
