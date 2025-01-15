import java.util.Scanner;


public class IllegalArgumentException extends Throwable {

 // Method to generate IllegalArgumentException
 public static void generateIllegalArgumentException(String input) {
  // Attempt to use substring with invalid indices (start index > end index)
  System.out.println("Attempting to get substring with invalid indices (5, 2):");
  System.out.println(input.substring(5, 2));  // This will throw IllegalArgumentException
 }

 // Method to handle IllegalArgumentException
 public static void handleIllegalArgumentException(String input) {
  try {
   // Attempt to use substring with invalid indices (start index > end index)
   System.out.println("Attempting to get substring with invalid indices (5, 2):");
   System.out.println(input.substring(5, 2));  // This will throw IllegalArgumentException
  } catch (java.lang.IllegalArgumentException e) {
   // Handle IllegalArgumentException
   System.out.println("Caught IllegalArgumentException: " + e.getMessage());
  } catch (RuntimeException e) {
   // Handle any other RuntimeException
   System.out.println("Caught RuntimeException: " + e.getMessage());
  }
 }

 public static void main(String[] args) {
  // Scanner to take user input
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a string:");
  String userInput = sc.nextLine();  // Taking user input

  // First call: Demonstrate the method that generates IllegalArgumentException
  System.out.println("\nGenerating IllegalArgumentException without handling it:");
  try {
   generateIllegalArgumentException(userInput);  // This will throw the exception
  } catch (RuntimeException e){
   System.out.println("Caught exception: " + e.getMessage());
  }


  System.out.println("\nHandling IllegalArgumentException with try-catch block:");
  handleIllegalArgumentException(userInput);  // This will handle the exception inside the method

 }
}
