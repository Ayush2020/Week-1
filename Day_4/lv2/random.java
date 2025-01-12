import java.util.Arrays;

class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number (between 1000 and 9999)
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // Calculate average
        double average = sum / numbers.length;

        
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Find the average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);
        
        
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
