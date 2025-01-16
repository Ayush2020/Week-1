import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count the number of occurrences of a substring in a string
    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;

        // Loop through the string to find all occurrences of the substring
        while ((index = str.indexOf(substring, index)) != -1) {
            count++; 
            index += substring.length(); 
        }

        return count;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the main string and the substring
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String substring = sc.nextLine();

        // Call the countSubstringOccurrences method and get the count
        int count = countSubstringOccurrences(str, substring);

        System.out.println("The substring '" + substring + "' occurs " + count + " times in the string.");

    }
}
