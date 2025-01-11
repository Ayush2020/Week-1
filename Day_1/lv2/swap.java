import java.util.Scanner;

class twoNumber{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	int swap  =  num1;
	num1 = num2;
	num2 = swap; 
	
	
	System.out.println("The Swapped numbers area " + num1 + " and " + num2);
	}
}