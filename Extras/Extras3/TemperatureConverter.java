import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    // Function to get the temperature input from the user
    public static double getTemperatureInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to display the result
    public static void displayResult(double convertedTemp, String unit) {
        System.out.println("Converted temperature: " + convertedTemp + " " + unit);
    }

    public static void main(String[] args) {
        // Get the temperature and the unit of measurement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Is the temperature in Fahrenheit or Celsius? (F/C): ");
        char unit = sc.next().charAt(0);

        if (unit == 'F' || unit == 'f') {
            // Convert Fahrenheit to Celsius
            double celsius = fahrenheitToCelsius(temp);
            displayResult(celsius, "Celsius");
        } else if (unit == 'C' || unit == 'c') {
            // Convert Celsius to Fahrenheit
            double fahrenheit = celsiusToFahrenheit(temp);
            displayResult(fahrenheit, "Fahrenheit");
        } else {
            System.out.println("Invalid unit. Please enter 'F' for Fahrenheit or 'C' for Celsius.");
        }
    }
}
