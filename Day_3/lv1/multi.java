import java.util.Scanner;

class NumberMultiplication{
	public static void main(String []args){
	
		//Create an sc object for an user input
		Scanner sc = new Scanner(System.in);
		// taken an user input and store it in a number variable 
		int number = sc.nextInt();
		//Create an integer array to store results
		int[] multi = new int[10];
		
		// Loop to calculate multiplication results and store them in the array
		for (int i = 1; i<= 10; i++){
			multi[i-1] = number * i;
 		}
		
		// Display the multiplication table in the desired format

		for (int i = 1; i<= 10; i++){
			System.out.println(number + " * " + i + " = " + multi[i - 1]);
		}
		
	}
}