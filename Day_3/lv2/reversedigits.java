import java.util.Scanner;

class NumberReverse{
	public static void main(String []args){
		// Create a sc object to get user input
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		int temp = number;
		while (temp != 0){
			temp = temp / 10;
			count++;
		}
		// create an array to store the digits of the number
		int[] digits = new int[count];
		
		//store them in array
		temp = number;
		for (int i = 0; i < count; i++){
			digits[i] = temp % 10;
			temp = temp /10;
		}
		
		
		
		// create an array for the reverse digits
		int[] reverseDigits = new int[count];
		
		for (int i = 0; i < count; i++){
			reverseDigits[i] = digits[count -1 - i];
			
		}
		
		
		System.out.println("Reversed Number: ");
		for (int i = 0; i< count; i++){
			System.out.println(reverseDigits[i]);
		}
		
	}
}