import java.util.Random;

class EmployeeBonusCalculator {

    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] data = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            // Generate a random 5-digit salary between 50000 and 99999
            data[i][0] = 50000 + (random.nextDouble() * 50000);
            // Generate a random number of years of service between 1 and 10
            data[i][1] = 1 + random.nextInt(10);
        }

        return data;
    }

    // Method to calculate the new salary and bonus for each employee
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];

            // Calculate the bonus percentage
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;

            // Calculate the bonus and new salary
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;  // old salary
            updatedData[i][1] = newSalary;  // new salary
            updatedData[i][2] = bonus;      // bonus amount
        }

        return updatedData;
    }

    // Method to calculate the sum of old salaries, new salaries, and total bonus
    public static double[] calculateTotals(double[][] updatedData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < updatedData.length; i++) {
            sumOldSalary += updatedData[i][0];
            sumNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }

        return new double[]{sumOldSalary, sumNewSalary, totalBonus};
    }

    // Method to display the results in a tabular format
    public static void displayResults(double[][] updatedData, double[] totals) {
        System.out.printf("%-10s %-15s %-15s %-15s%n", "Employee", "Old Salary", "New Salary", "Bonus");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < updatedData.length; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f%n", (i + 1), updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f%n", "Totals", totals[0], totals[1], totals[2]);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData(numEmployees);

        // Step 2: Calculate new salary and bonus
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Step 3: Calculate totals
        double[] totals = calculateTotals(updatedData);

        // Step 4: Display the results in a tabular format
        displayResults(updatedData, totals);
    }
}
