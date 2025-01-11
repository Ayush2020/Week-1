import java.util.Scanner;

class maximumNumber{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int possibleHandshakes = (n * (n - 1)) / 2;
	
	System.out.println(possibleHandshakes);
	
	
	}
	
}