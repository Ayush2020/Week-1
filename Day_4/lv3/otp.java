import java.util.HashSet;

class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (6-digit number)
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Use a HashSet to ensure uniqueness of OTPs
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        // If the size of the HashSet equals the size of the array, it means all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        // Array to store 10 generated OTP numbers
        int[] otpNumbers = new int[10];

        // Generate 10 OTP numbers
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpNumbers[i]);
        }

        // Validate if all the OTP numbers are unique
        boolean isUnique = areOTPsUnique(otpNumbers);

        // Print result based on uniqueness of OTPs
        if (isUnique) {
            System.out.println("\nAll generated OTPs are unique.");
        } else {
            System.out.println("\nThere are duplicate OTPs.");
        }
    }
}
