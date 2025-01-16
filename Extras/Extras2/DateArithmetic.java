import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a DateTimeFormatter to read the input date in a specific format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Prompt the user to enter a date in the format yyyy-MM-dd
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Parse the input date using the formatter
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the updated date
        updatedDate = updatedDate.minusWeeks(3);

        // Display the modified date
        System.out.println("Updated date after adding and subtracting: " + updatedDate);
    }
}
