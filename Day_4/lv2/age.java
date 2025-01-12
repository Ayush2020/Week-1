import java.util.Scanner;

class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate if age is negative
        if (age < 0) {
            return false; // Cannot vote if age is negative
        }
        // Check if age is 18 or above
        if (age >= 18) {
            return true; // Can vote
        } else {
            return false; // Cannot vote
        }
    }

    public static void main(String[] args) {
        // Create an instance of StudentVoteChecker to use the canStudentVote method
        StudentVoteChecker checker = new StudentVoteChecker();
        
        // Create an array to store the ages of 10 students
        int[] studentAges = new int[10];

        // sc for user input
        Scanner sc = new Scanner(System.in);

        // Loop through the array to take user input for the students' ages
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            int age = sc.nextInt(); // Get age from the user
            studentAges[i] = age; // Store the age in the array

            
            if (checker.canStudentVote(age)) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

    }
}
