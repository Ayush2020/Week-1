import java.util.Scanner;

public class LongestWordInSentence {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");

        // Initialize a variable to store the longest word
        String longestWord = "";

        // Loop through the words array to find the longest word
        for (String word : words) {
            // Check if the current word is longer than the current longest word
            if (word.length() > longestWord.length()) {
                longestWord = word;  
            }
        }

        return longestWord;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Call the findLongestWord method to find the longest word in the sentence
        String longestWord = findLongestWord(sentence);

        // Display the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);

    }
}
