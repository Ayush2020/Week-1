import java.util.Scanner;

public class ReverseString {

    // Method to reverse the given string
    public static String reverseString(String input) {
        String reversed = ""; 

        // Loop through the input string from the end to the start
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); 
        }

        return reversed; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the reverseString method and get the reversed string
        String reversed = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

    }
}