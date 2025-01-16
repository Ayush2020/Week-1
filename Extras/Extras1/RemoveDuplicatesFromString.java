import java.util.Scanner;

public class RemoveDuplicatesFromString {

    // Method to remove duplicate characters from the string
    public static String removeDuplicates(String input) {
        // Use a StringBuilder to build the new string without duplicates
        StringBuilder result = new StringBuilder();

        // Use a boolean array to keep track of characters that have already been seen
        boolean[] seen = new boolean[256]; 

        // Loop through the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character has already been encountered
            if (!seen[ch]) {
                result.append(ch);  
                seen[ch] = true;    
            }
        }

        return result.toString();  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the removeDuplicates method
        String modifiedString = removeDuplicates(input);

        // Display the modified string
        System.out.println("String after removing duplicates: " + modifiedString);

    }
}
