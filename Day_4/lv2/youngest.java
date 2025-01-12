import java.util.Scanner;

class YoungestAndTallestFriends {

    
    public static String findYoungestFriend(String[] names, int[] ages) {
        int minAge = ages[0];
        String youngest = names[0];

        // Iterate over the array to find the minimum age
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    // Method to find the tallest friend
    public static String findTallestFriend(String[] names, double[] heights) {
        double maxHeight = heights[0];
        String tallest = names[0];

        // Iterate over the array to find the maximum height
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Create arrays to store the names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Create a sc object for user input
        Scanner sc = new Scanner(System.in);

        // Take input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt(); // Input age

            System.out.print("Enter height (in meters) of " + names[i] + ": ");
            heights[i] = sc.nextDouble(); // Input height
        }

        // Find the youngest and tallest friends
        String youngest = findYoungestFriend(names, ages);
        String tallest = findTallestFriend(names, heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

    }
}
