import java.util.Scanner;

class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown value for rocket launch: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println("Countdown: " + counter);
            counter--; // Decrement the counter
        }

        System.out.println("Rocket Launched!");

    }
}
