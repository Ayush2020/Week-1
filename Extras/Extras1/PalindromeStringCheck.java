import java.util.Scanner;

public class PalindromeStringCheck {

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String input) {
        // Convert the string to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Loop through the string and compare characters from both ends
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            // If the characters don't match, it's not a palindrome
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // If all characters matched, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the isPalindrome method and check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}
