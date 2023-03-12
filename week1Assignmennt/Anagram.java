package week1Assignmennt;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Declare two string values
		String name1="wolf";
		String name2="flow";
		//Initialize the string length
		int length1 = name1.length();
		int length2 = name2.length();
		//Initialize if condition to compare the length
		if (length1==length2) {
			//Print the values if it is equal
			System.out.println("Both are equal");
			
		}else
		{
			//print the values if it is not equal
			System.out.println("Both are not equal");
		}
		//Initialize string values to each characters using toCharArray
		char[] charArray1 = name1.toCharArray();
		char[] charArray2 = name2.toCharArray();
		//Sort the Values as ascending
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		//Print the values
		System.out.println(charArray1);
		System.out.println(charArray2);
		//Initialize if condition
		if (Arrays.equals(charArray1, charArray2)) {
			//print the values if it is anagram
			System.out.println("It is Anagram");
			
		} else {
			//print the values if it is not Anagram
			System.out.println("It is not Anagram");

		}
	}

}
