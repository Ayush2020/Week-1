import java.util.Scanner;

public class CharacterTypeFinder {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
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

    // Method to find vowels, consonants, and non-letters in a string
    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);  
            result[i][1] = checkCharacterType(ch); 
        }

        return result;  
    }

    // Method to display the 2D Array in a tabular format
    public static void displayCharacterTypes(String[][] characterTypes) {
        System.out.println("Character\tType");
        for (int i = 0; i < characterTypes.length; i++) {
            System.out.println(characterTypes[i][0] + "\t\t" + characterTypes[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Call the method to find the character types
        String[][] characterTypes = findCharacterTypes(userInput);

        // Call the method to display the results in a tabular format
        displayCharacterTypes(characterTypes);
    }
}
