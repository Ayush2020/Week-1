import java.util.Scanner;

class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        // Base case: if n is 1, the sum is 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum of n natural numbers is n + sum of (n-1) numbers
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula n * (n + 1) / 2
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number n
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }
        
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

      
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRecursion);
        System.out.println("Sum of first " + n + " natural numbers using the formula: " + sumFormula);

       
        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the same result. The result is correct!");
        } else {
            System.out.println("There is a discrepancy between the results.");
        }

    }
}