import java.util.Random;

public class StudentGrade {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] RandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array for storing scores of each student

        for (int i = 0; i < numStudents; i++) {
            // Randomly generate 2-digit scores for each student and each subject
            scores[i][0] = 50 + random.nextInt(50); // Physics (50 to 99)
            scores[i][1] = 50 + random.nextInt(50); // Chemistry (50 to 99)
            scores[i][2] = 50 + random.nextInt(50); // Math (50 to 99)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] TotalAveragePercentage(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // 2D array to store total, average, and percentage

        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2]; // Sum of all three subject scores
            double average = total / 3.0; // Average score
            double percentage = (total / 300.0) * 100; // Percentage calculation
            results[i][0] = total; // Store total score
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round average to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round percentage to 2 decimal places
        }
        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[][] calculateGrades(double[][] results, int numStudents) {
        String[][] grades = new String[numStudents][1]; // 2D array to store grade

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];
            String grade = "";
            // Grade based on percentage
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B+";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "F";
            }
            grades[i][0] = grade;
        }
        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScoreCard(int[][] scores, double[][] results, String[][] grades, int numStudents) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        
        for (int i = 0; i < numStudents; i++) {
            // Display scores, total, average, percentage, and grade for each student
            System.out.printf("%d\t", (i + 1));
            System.out.printf("%d\t\t", scores[i][0]);
            System.out.printf("%d\t\t", scores[i][1]);
            System.out.printf("%d\t\t", scores[i][2]);
            System.out.printf("%.2f\t", results[i][0]); 
            System.out.printf("%.2f\t", results[i][1]); 
            System.out.printf("%.2f\t", results[i][2]); 
            System.out.printf("%s\n", grades[i][0]);     
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; 

        // Generate random scores for the students
        int[][] scores = RandomScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = TotalAveragePercentage(scores, numStudents);
        String[][] grades = calculateGrades(results, numStudents);
        displayScoreCard(scores, results, grades, numStudents);
    }
}


