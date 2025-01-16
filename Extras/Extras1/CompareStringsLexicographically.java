import java.util.Scanner;

public class CompareStringsLexicographically {

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        // Find the minimum length between the two strings to avoid index out of bounds
        int minLength = Math.min(str1.length(), str2.length());

        // Compare characters of both strings
        for (int i = 0; i < minLength; i++) {
            // Compare the characters at the same position
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1; 
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1; 
            }
        }

        // If all characters are equal, compare lengths
        if (str1.length() < str2.length()) {
            return -1; 
        } else if (str1.length() > str2.length()) {
            return 1; 
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Compare the two strings lexicographically
        int result = compareStrings(str1, str2);

        // Display the result based on comparison
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        }

    }
}
