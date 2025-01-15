import java.util.Scanner;

public class FirstNonReapeating{
    // methord to find non repeating character in a string
    public static char findFirstNonRepeating(String text){
        int[] frequency = new int[256];

        //loop through string to calculate the frequency
        for (int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
            frequency[currentChar] ++;
        }

        for (int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1){
                return currentChar;
            }
        }
        return 0;

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        char result = findFirstNonRepeating(s);

        if (result != 0){
            System.out.println("First non repeating character : " + result);
        }else {
            System.out.println("NO NON REAPEATING CHARACTER ");
        }
    }

}