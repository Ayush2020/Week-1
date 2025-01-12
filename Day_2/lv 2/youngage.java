import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input for ages of the three friends
        System.out.print("age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("age of Anthony: ");
        int ageAnthony = scanner.nextInt();

        // Get input for heights of the three friends
        System.out.print("height of Amar (in meters): ");
        double heightAmar = scanner.nextDouble();
        System.out.print("height of Akbar (in meters): ");
        double heightAkbar = scanner.nextDouble();
        System.out.print("height of Anthony (in meters): ");
        double heightAnthony = scanner.nextDouble();

        // Find the youngest friend (smallest age)
        String youngestFriend = "Amar";
        int youngestAge = ageAmar;

        if (ageAkbar < youngestAge) {
            youngestFriend = "Akbar";
            youngestAge = ageAkbar;
        }
        if (ageAnthony < youngestAge) {
            youngestFriend = "Anthony";
            youngestAge = ageAnthony;
        }

        // Find the tallest friend (largest height)
        String tallestFriend = "Amar";
        double tallestHeight = heightAmar;

        if (heightAkbar > tallestHeight) {
            tallestFriend = "Akbar";
            tallestHeight = heightAkbar;
        }
        if (heightAnthony > tallestHeight) {
            tallestFriend = "Anthony";
            tallestHeight = heightAnthony;
        }
        System.out.println("The youngest friend is: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + tallestHeight + " meters)");
        
    }
}
