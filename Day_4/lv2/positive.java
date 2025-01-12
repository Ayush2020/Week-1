import java.util.Scanner;

class NumberCheck {

    // Method to check whether the number is positiv
    public static String isPositive(int number) {
        if (number < 0) {
            return "negative";
        } else {
            return "positive";
        }
    }

    // Method to check whether the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater than number2
        } else if (number1 < number2) {
            return -1; // number1 is less than number2
        } else {
            return 0; // number1 is equal to number2
        }
    }

    public static void main(String[] args) {
        // Create an array to store 5 numbers
        int[] numbers = new int[5];
        
        // Create a Sc object for user input
        Scanner sc = new Scanner(System.in);

        // Loop through the array and get user input for each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Loop through the array to check if the numbers are positive or negative
        // Also, check if positive numbers are even or odd
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            System.out.print("Number " + (i + 1) + " (" + numbers[i] + ") is " + positivity + ". ");
            
            if (positivity.equals("positive")) {
                String evenOrOdd = isEven(numbers[i]);
                System.out.println("It is " + evenOrOdd + ".");
            } else {
                System.out.println();
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

    }
}
