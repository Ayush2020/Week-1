import java.util.Scanner;

public class PalindromeChecker {

    // Function to take user input
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        return sc.nextLine();
    }

    // Function to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Compare characters from the start and end of the string
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true;  
    }

    // Function to display the result
    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println(" String is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        // Get input from the user
        String input = getInput();

        // Check if the string is a palindrome
        boolean isPalindromeResult = isPalindrome(input);
        displayResult(isPalindromeResult);
    }
}
