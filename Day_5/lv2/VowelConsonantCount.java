import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);  
        if (ch >= 'a' && ch <= 'z') {  
            if ("aeiou".indexOf(ch) != -1) {  
                return "Vowel";
            } else {
                return "Consonant";  
            }
        }
        return "Not a Letter"; 
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[] { vowels, consonants }; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call  method to count vowels and consonants
        int[] counts = countVowelsConsonants(userInput);

     
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

    }
}
