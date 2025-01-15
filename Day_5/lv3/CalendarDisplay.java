import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // Subtract 1 since month is 1-based
    }

    // Method to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year rule
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month
    public static int getDaysInMonth(int month, int year) {
        // Array storing the number of days in each month
        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Adjust for February in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1]; 
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Adjust for January and February in the Gregorian algorithm
        if (month <= 2) {
            month += 12;
            year--;
        }

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0; // The day of the week (0 = Sunday, 6 = Saturday)
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        // Get the name of the month and number of days in the month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);

        // Print the header for the calendar
        System.out.printf("       %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    "); 
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day); 

            // Move to the next line after Saturday (i.e., after the 7th day of the week)
            if ((firstDayOfMonth + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

    }
}
