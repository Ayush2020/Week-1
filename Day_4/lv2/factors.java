import java.util.Scanner;

class FactorsCalculator {

    // Method to find the factors of a number and store them in an array
    public static int[] findFactors(int number) {
        // First loop to count the factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors; // Return the array of factors
    }

    // Method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); // Square each factor and add to sum
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display the sum of the factors
        int sum = findSum(factors);
        System.out.println("Sum of the factors: " + sum);

        // Calculate and display the product of the factors
        long product = findProduct(factors);
        System.out.println("Product of the factors: " + product);

        
        double sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of the factors: " + sumOfSquares);

    }
}
