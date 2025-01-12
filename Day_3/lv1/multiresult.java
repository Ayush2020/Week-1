import java.util.Scanner;

class Multiplication{
	public static void main(String []args){
		//create an sc object for an user input
		Scanner sc = new Scanner(System.in);
		
		//taken user input and store it in a number variable
		int number = sc.nextInt();
		
		
		//validate the number if number is between 6-9
		if (number < 6 || number >9){
			System.out.println("Enter valid number");
			return;
		}
		int[] multiplicationResult = new int[10];
		
		for (int i = 1; i<= 10;i++){
			multiplicationResult[i-1] = number * i;
			
		}
		System.out.println("Multiplication table of " + number );
		for(int i = 1; i<= 10; i++){
			System.out.println(number + " * " + i + " - " + multiplicationResult[i-1]);
		}
		
	}
}