import java.util.Scanner;

class ChocolateDivision {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2]; // Array to store quotient and remainder

        // Calculate how many chocolates each child will get (quotient)
        result[0] = numberOfChocolates / numberOfChildren;  // Chocolates per child
        result[1] = numberOfChocolates % numberOfChildren;  // Remaining chocolates

        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of chocolates and number of children from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Check if the number of children is greater than 0 to avoid division by zero
        if (numberOfChildren <= 0) {
            System.out.println("Error: Number of children must be greater than 0.");
        } else {
            
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

           
            System.out.println("Each child gets: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
