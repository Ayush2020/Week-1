import java.util.Scanner;

class CompareStrings{

	public static  boolean compareStrings(String string1, String string2 ){
		if (string1.length() != string2.length()){
			return false;
		}
		for(int i = 0; i< string1.length();i++){
			if (string1.charAt(i) != string2.charAt(i)){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String string1 = sc.next();
		String string2 = sc.next();
		boolean charAtResult = compareStrings(string1,string2);
		boolean equalsResult = string1.equals(string2);
		
		System.out.println(charAtResult);
		System.out.println(equalsResult);
		//System.out.	println(charAtResult == equalsResult);
		
		
	}
}