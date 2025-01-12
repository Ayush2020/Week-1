import java.util.Scanner;

class HandShakes{

    public static int handshakesCalc(int n){
        return (n * (n-1))/2;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int n =  sc.nextInt();

        int handshakes = handshakesCalc(n);

        System.out.println("The number of Handshakes amount " + n + " Students is : " + handshakes);
    }
}