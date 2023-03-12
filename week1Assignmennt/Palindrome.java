package week1Assignmennt;

public class Palindrome {
	public static void main(String[] args) {
		//Declare the string name
		String name="malayalam";
		//Declare empty string as rev
		String rev="";
		//initialize string to upper case
		String upperCase = name.toUpperCase();
		//split each characters from string using toCharArray
		char[] charArray = upperCase.toCharArray();
		//initialize for loop
		for (int i = charArray.length-1; i >=0 ; i--) {
			//store the iteration in rev
			rev=rev+charArray[i];
			
		}
		//print the values rev
		System.out.println(rev);
		//Initialize if condition 
		if (name.equalsIgnoreCase(rev)) {
			//print if it is palindrome
			System.out.println("It is a Plaindrome");
			
		} else {
			//print if it is not palindrome
			System.out.println("It is not a Palindrome");

		}
	
	}

}
