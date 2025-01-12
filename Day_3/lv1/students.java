import java.util.Scanner;

class Students{
	public static void main(String []args){
		//Create an array to hold the ages of 10 students 
		int[] age = new int[10];
		//Create a sc object to take a user input
		Scanner sc = new Scanner(System.in);
		//loop through the array to get ages for 10 students
		for (int i = 0; i < age.length; i++ ){
			System.out.println("Enter age : " + (i + 1));
			age[i] = sc.nextInt();
			
			//Check if the age is ngative
			if (age[i] < 0){
				System.err.println("Invalid age " + (i+1));
				System.exit(0);
			}else if (age[i] >= 18) {
				System.out.println("The student with the age " + age[i] + " can vote.");
			}else{
				System.out.println("The student with the age " + age[i] + " cannot vote.");
			}

			}
		
	}
}