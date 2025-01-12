import java.util.Random;

class MatrixOperations {

    // Method to create a random matrix with specified rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to display the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        // Create two 2x2 random matrices
        int[][] matrix1 = createRandomMatrix(2, 2);
        int[][] matrix2 = createRandomMatrix(2, 2);
        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Matrix Addition
        int[][] additionResult = addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition Result:");
        displayMatrix(additionResult);

        // Matrix Subtraction
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        System.out.println("Matrix Subtraction Result:");
        displayMatrix(subtractionResult);

        // Transpose of Matrix 1
        int[][] transposeResult = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeResult);
    }
}
