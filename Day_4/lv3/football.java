import java.util.Random;

class FootballTeam {

    // Method to generate random heights for the players
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        
        // Generate random height between 150 and 250
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(101) + 150;  // Range between 150 and 250
        }
        
        return heights;
    }

    // Method to find the sum of all the elements in the heights array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return sum / (double) heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Generate random heights for the football team (11 players)
        int[] heights = generateRandomHeights(11);

        // Find the sum, mean, shortest, and tallest height
        int sum = findSum(heights);
        double mean = findMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        
        System.out.println("Heights of the players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n");

        System.out.println("Sum of all heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
