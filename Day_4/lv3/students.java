import java.util.Random;

class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths for all students
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            // Generate random marks for Physics, Chemistry, and Math (2-digit values between 0 and 100)
            scores[i][0] = 50 + random.nextInt(51); // Physics (random between 50 and 100)
            scores[i][1] = 50 + random.nextInt(51); // Chemistry (random between 50 and 100)
            scores[i][2] = 50 + random.nextInt(51); // Math (random between 50 and 100)
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  // Sum of marks
            double average = total / 3.0;  // Average marks
            double percentage = (total / 300.0) * 100;  // Percentage (out of 300)

            // Rounding off values to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard of all students
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10d %-10.2f %-10.2f%n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], (int) results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        // Take the number of students as input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Step 1: Generate random marks for all students
        int[][] scores = generateRandomScores(numStudents);

        // Step 2: Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Step 3: Display the scorecard
        displayScoreCard(scores, results);
    }
}
