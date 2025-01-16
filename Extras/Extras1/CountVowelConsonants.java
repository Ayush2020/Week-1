import java.util.Scanner;

public class CountVowelConsonants {

    // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String input) {
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to count vowels and consonants
        countVowelsAndConsonants(input);

    }
}
