import java.util.Scanner;

class StudentGrades{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number of Students: ");
		
		// taken an input for the number of students
		int numberOfStudents = sc.nextInt();
		
		//declare arrays for storinng marks percentage and grades
		double[][] marks = new double[numberOfStudents][3];  
        double[] percentages = new double[numberOfStudents]; 
        String[] grades = new String[numberOfStudents];      

        // Loop to take input for marks of each student
        for (int i = 0; i < numberOfStudents; i++) {
            double physics, chemistry, maths;

            // Take input for marks in Physics, Chemistry, and Maths with validation
            while (true) {
                System.out.print("Enter marks for Physics for student " + (i + 1) + ": ");
                physics = sc.nextDouble();
                if (physics >= 0) break;
                else System.out.println("Please enter a positive value for Physics marks.");
            }

            while (true) {
                System.out.print("Enter marks for Chemistry for student " + (i + 1) + ": ");
                chemistry = sc.nextDouble();
                if (chemistry >= 0) break;
                else System.out.println("Please enter a positive value for Chemistry marks.");
            }

            while (true) {
                System.out.print("Enter marks for Maths for student " + (i + 1) + ": ");
                maths = sc.nextDouble();
                if (maths >= 0) break;
                else System.out.println("Please enter a positive value for Maths marks.");
            }

            // Store marks in the marks array
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            // Calculate percentage
            double totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 300) * 100;
            percentages[i] = percentage;

            // Calculate grade based on percentage
            if (percentage >= 90) {
                grades[i] = "A";
            } else if (percentage >= 75) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else if (percentage >= 35) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

       
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics marks: " + marks[i][0]);
            System.out.println("Chemistry marks: " + marks[i][1]);
            System.out.println("Maths marks: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("Grade: " + grades[i]);
        }

    }
}
		