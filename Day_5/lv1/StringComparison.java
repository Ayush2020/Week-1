import java.util.Scanner;

public class StringComparison{

	public static char[] compareStringArray(String s){
		char[] charArray = new char[s.length()];
		for(int i =0; i < s.length(); i++){
			charArray[i] = s.charAt(i);
		}
		return charArray;
	}
	
	public static boolean compareStrings(char[] arr1, char[] arr2){
		if(arr1.length != arr2.length){
			return false;
		}
		for(int i = 0; i < arr1.length; i++){
			if (arr1[i] != arr2[i]){
			
			return false;
			}
		}
		return true;
		
	}


	public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String: ");
			String text = sc.next();
			
			
			char[] customArray = compareStringArray(text);
			char[] builtInArray = text.toCharArray();
			
			boolean equalArray = compareStrings(customArray, builtInArray); 
			
			if(equalArray){
				System.out.println("Equal String");
			} else{
				System.out.println("Non Equal");
			}
			
	}
}