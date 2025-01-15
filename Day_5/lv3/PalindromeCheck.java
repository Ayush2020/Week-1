import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Compare characters from the start and end of the string iteratively
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop through the text and compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true; 
    }

    // Logic 2: Recursive method to check if the string is a palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // If the start index is greater than or equal to the end index, return true
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // If characters don't match, it's not a palindrome
        }
        // Recursive call with next start and previous end
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays to reverse the string and compare
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray(); // Convert the string to a character array
        char[] reversedArray = new char[originalArray.length];

        // Reverse the character array
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false; // If characters don't match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Remove spaces and convert to lowercase to handle cases like "A man a plan a canal Panama"
        String sanitizedString = inputString.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using Logic 1 (Iterative)
        boolean resultIterative = isPalindromeIterative(sanitizedString);
        System.out.println("Palindrome check (Iterative): " + resultIterative);

        // Check palindrome using Logic 2 (Recursive)
        boolean resultRecursive = isPalindromeRecursive(sanitizedString, 0, sanitizedString.length() - 1);
        System.out.println("Palindrome check (Recursive): " + resultRecursive);

        // Check palindrome using Logic 3 (Character Array Reversal)
        boolean resultArray = isPalindromeUsingArray(sanitizedString);
        System.out.println("Palindrome check (Using Array Reversal): " + resultArray);

    }
}
