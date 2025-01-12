import java.util.Scanner;

class RocketLaunchCountdown2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown value for rocket launch: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
        System.out.println("Rocket Launched!");
    }
}
