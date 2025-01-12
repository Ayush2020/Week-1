import java.util.Scanner;

class Calculator{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		String op = sc.next();
		double result = 0;
		
		for(int i = 1; i < 2; i++){
			switch(op){
				case "+":
					result = first + second;
				    break;
				case "-":
					result = first - second;
				    break;
				case "*":
					result = first * second;
				    break;
				case "/":
					result = first / second;
				    if(second != 0){
						result = first / second;					
					} 
					break;
				default:
				System.out.println("Invalid");
					
					
			}
		}
		
		System.out.println(result);
		
	}
}