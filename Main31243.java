public class Main31243 {
    public static void main(String[] args) {
    String[] rawData = {"100", "Oops", null};
        try {
            int convertedNumber = Integer.parseInt(rawData[1]);
        } catch (NumberFormatException  e) {
          System.err.println("Format Error: That is not a valid number!");
        }
        catch(NullPointerException e){
            System.err.println("Null Error: The data is completely missing!");
        }
        catch(Exception e){
            System.err.println("Unknown Error Caught!");
        }
        finally{
            System.out.println("This is a text from finally");
        }
    } 
}
