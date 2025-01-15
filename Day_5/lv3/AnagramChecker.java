import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of both texts are equal
        if (text1.length() != text2.length()) {
            return false; 
        }

        // Convert both texts to character arrays
        char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();

        // Create arrays to store the frequency of characters for both texts
        int[] freq1 = new int[256]; 
        int[] freq2 = new int[256]; 

        
        for (int i = 0; i < array1.length; i++) {
            freq1[array1[i]]++; 
            freq2[array2[i]]++; 
        }

        // Compare the frequency arrays for both texts
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Take user inputs for the two texts
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();
        
        boolean result = areAnagrams(text1, text2);
        
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

    }
}
