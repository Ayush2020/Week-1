import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a sc object to get user input
        Scanner sc = new Scanner(System.in);

        // Define arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height for each of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter the height of friend " + (i + 1) + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Initialize variables to find the youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop through the arrays to find the youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // Update the index of the youngest friend
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; // Update the index of the tallest friend
            }
        }

       
        System.out.println("\nThe youngest friend is:");
        if (youngestIndex == 0) {
            System.out.println("Amar, Age: " + ages[youngestIndex]);
        } else if (youngestIndex == 1) {
            System.out.println("Akbar, Age: " + ages[youngestIndex]);
        } else {
            System.out.println("Anthony, Age: " + ages[youngestIndex]);
        }

        System.out.println("\nThe tallest friend is:");
        if (tallestIndex == 0) {
            System.out.println("Amar, Height: " + heights[tallestIndex] + " cm");
        } else if (tallestIndex == 1) {
            System.out.println("Akbar, Height: " + heights[tallestIndex] + " cm");
        } else {
            System.out.println("Anthony, Height: " + heights[tallestIndex] + " cm");
        }

    }
}
