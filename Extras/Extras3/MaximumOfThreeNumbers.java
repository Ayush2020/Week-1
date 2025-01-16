import java.util.Scanner;

public class MaximumOfThreeNumbers {

    // Function to take integer inputs from the user
    public static int[] takeInputs() {
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter 3 numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Returning the numbers as an array
        return new int[]{num1, num2, num3};
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        // Compare the numbers to find the maximum
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        // Step 1: Take input
        int[] numbers = takeInputs();

        // Step 2: Find the maximum value
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);

        // Step 3: Display the maximum value
        System.out.println("The maximum value is: " + max);
    }
}
