import java.util.Scanner;


class HandShakes2{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int n =  sc.nextInt();

        int handshakes = (n * (n -1))/2;


        System.out.println("The number of Handshakes amount " + n + " Students is : " + handshakes);
    }
}