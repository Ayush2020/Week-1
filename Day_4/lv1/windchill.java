import java.util.Scanner;

class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Calculate wind chill using the formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WindChillCalculator calculator = new WindChillCalculator();

        // Take user input for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        // Validate inputs for realistic values
        if (windSpeed < 0 || temperature < -100 || temperature > 100) {
            System.out.println("Please enter valid values. Temperature should be between -100°F and 100°F, and wind speed should be positive.");
        } else {
            // Calculate the wind chill
            double windChill = calculator.calculateWindChill(temperature, windSpeed);

            // Display the result
            System.out.println("The wind chill temperature is: " + windChill + "°F");
        }
    }
}
