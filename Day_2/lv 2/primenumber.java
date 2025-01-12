import java.util.Scanner;

class PrimeNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i < number; i++){
			if (number % i == 0){
				isPrime = false;
				break;
			}
			
		}
		if (isPrime && number > 1){
			System.out.println("Prime Number");
		} else{
			System.out.println("Not a Prime Number");
		}
		
	
	}	
}