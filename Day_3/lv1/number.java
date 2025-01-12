import java.util.Scanner;

class CheckNumber{
	public static void main(String []args){
		// create an array to hold 5 numbers
		int[] number = new int [5];
		
		// create a sc object to take user input
		Scanner sc = new Scanner(System.in);
		
		//loop through the array for 5 numbers 
		for (int i = 0; i < number.length; i++){
			System.out.println("Enter Number: " + (i+1));
			number[i] = sc.nextInt();
			
			// check for even or odd numbers
			if (number[i] > 0){
				System.out.println("Posituve ");
				if (number[i] % 2 == 0){
					System.out.println("Even Number ");
				} else{
					System.out.println("Odd Number ") ;
				}
			} else{
				System.out.println("Negative");
			}
		}
		
	}
}