import java.util.Scanner;

class OddEven{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		//Check if a number is natural or not
		if (number <=0){
			System.err.println("Not a natural number");
			System.exit(0);
		}
		
		int size = number/2 +1;
		//Create an array for odd even 
		int[] evenNumber = new int[size];
		int[] oddNumber = new int[size];
		
		//create inex for odd and even
		int evenIndex = 0, oddIndex = 0;
		
		//iterate 
		for (int i = 1; i <= number ;i++){
			if (i % 2 == 0){
				evenNumber[evenIndex] = i;
				evenIndex++;
			}else{
				oddNumber[oddIndex] = i;
				oddIndex++;
			}
		}
		
		//for even numbers
		System.out.println("Even Numbers :");
		for(int i = 0; i< evenIndex; i++){
			System.out.println(evenNumber[i]);
		}
		
		
		System.out.println("Odd numbers : ");
		for (int i = 0; i < oddIndex; i++){
			System.out.println(oddNumber[i]);
		}
		
	}
}