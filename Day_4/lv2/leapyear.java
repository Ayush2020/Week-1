import java.util.Scanner;

class LeapYearChecker {

    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        // Ensure that the year is >= 1582 (Gregorian calendar start year)
        if (year < 1582) {
            System.out.println("The Gregorian calendar starts from the year 1582. Please enter a valid year.");
            return false;
        }

        // Check the leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}
