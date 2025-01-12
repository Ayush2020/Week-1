import java.util.Scanner;

class ArrayCopy2DTo1D {
    public static void main(String[] args) {
        // Create a sc object to get user input
        Scanner sc = new Scanner(System.in);

        // Take input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array (Matrix) based on user input
        int[][] matrix = new int[rows][cols];

        // Take user input to fill the 2D array (Matrix)
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] oneDArray = new int[rows * cols];

        // Copy elements from the 2D array to the 1D array
        int index = 0; // Index for 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index] = matrix[i][j]; // Copy element from 2D to 1D
                index++; // Increment index
            }
        }

        // Display the 1D array
        System.out.print("The 1D array is: ");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
    }
}
