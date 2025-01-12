import java.util.Scanner;



class SmallestAndLargest {

    // Method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2]; // Array to store smallest and largest numbers

        // Find the smallest and largest using conditional statements
        if (number1 <= number2 && number1 <= number3) {
            result[0] = number1; 
        } else if (number2 <= number1 && number2 <= number3) {
            result[0] = number2; 
        } else {
            result[0] = number3; 
        }

        if (number1 >= number2 && number1 >= number3) {
            result[1] = number1; // Largest
        } else if (number2 >= number1 && number2 >= number3) {
            result[1] = number2; // Largest
        } else {
            result[1] = number3; // Largest
        }

        return result; // Return the array with smallest and largest values
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for 3 numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Find the smallest and largest using the method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

    }
}
