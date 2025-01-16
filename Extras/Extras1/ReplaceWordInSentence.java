import java.util.Scanner;

public class ReplaceWordInSentence {

    // Method to replace a given word with another word in a sentence
    public static String replaceWord(String sentence, String targetWord, String replacementWord) {
        // Split the sentence into an array of words
        String[] words = sentence.split(" ");

        // Loop through the words and replace the target word with the replacement word
        for (int i = 0; i < words.length; i++) {
            // If the current word is the target word, replace it
            if (words[i].equals(targetWord)) {
                words[i] = replacementWord;
            }
        }

        // Join the array of words back into a single string
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the sentence input from the user
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        // Take the target word input from the user
        System.out.print("Enter the word to replace: ");
        String targetWord = sc.nextLine();

        // Take the replacement word input from the user
        System.out.print("Enter the replacement word: ");
        String replacementWord = sc.nextLine();

        // Call the replaceWord method to replace the target word with the replacement word
        String modifiedSentence = replaceWord(sentence, targetWord, replacementWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
