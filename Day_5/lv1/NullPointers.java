public class NullPointers {

   
    public static void generateNullPointerException() {
        String text = null;  // Initialize text to null
        System.out.println(text.length());  // This will throw NullPointerException
    }

   
    public static void handleNullPointerException() {
        String text = null;  // Initialize text to null
        try {
            
            System.out.println(text.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
         
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
       
        System.out.println("Generating NullPointerException without handling it:");
        try {
            generateNullPointerException();  // This will throw an exception
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

       
        System.out.println("\nHandling NullPointerException with try-catch block:");
        handleNullPointerException();  // This will handle the exception using try-catch
    }
}
