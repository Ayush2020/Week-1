import java.util.Scanner;

class CheckNumber{

    public static int number(int n){
        if (n > 0){
            return 1;
        }else if (n < 0){
            return -1;
        }else {
            return 0;
        }

    }
    public static void main(String []args){
        //create an sc object for takin user input
        Scanner sc = new Scanner(System.in);
        //taken an user input
        int n = sc.nextInt();

        int result = number(n);

        if (result == 1){
            System.out.println("Positive number:");
        } else if (result == -1) {
            System.out.println("Negative number:");
        }else {
            System.out.println("Zero Number: ");
        }


    }
}