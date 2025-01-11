
import java.util.Scanner;

class intOperation{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int operaOne = a + b * c;
	int operaTwo = a * b + c;
	int operaThree = c + a / b;
	int operaFour =  a % b + c;
	
	System.out.println("Results of Int Operation are " + operaOne + ", " + operaTwo + ", " + operaThree + " and " + operaFour);
	
	}
}