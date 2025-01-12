import java.util.Scanner;

class QuotientAndRemainder {

    // Method to find the quotient and remainder of the division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder

        // Calculate the quotient and remainder
        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder

        return result; // Return the array with quotient and remainder
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number and divisor from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Find the quotient and remainder using the method
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

    }
}

