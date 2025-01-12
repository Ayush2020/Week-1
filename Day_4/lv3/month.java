import java.util.Scanner;

class CalendarProgram {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // For February, check if it's a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month (using the Gregorian calendar formula)
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; // First day of the month
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Get the name of the month
        String monthName = getMonthName(month);
        
        // Print the month and year
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces for the first day of the month
        int dayOfWeek = firstDay;
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("    "); // 4 spaces for alignment
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday (7th day)
            if ((day + dayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // To ensure the calendar ends with a newline
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        
      
        displayCalendar(month, year);

    }
}
