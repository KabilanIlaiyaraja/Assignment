 package week1Assignmennt;

import java.util.Arrays;

public class Intersection {
 
	public static void main(String[] args) {
		//Declare int array values
		int []num1= {25,12,10,20,15};
		int []num2= {6,8,10,12,14,16};
		//Sort the values in ascending
		Arrays.sort(num1);
		Arrays.sort(num2);
		//initialize for loop
		for (int i = 0; i < num1.length; i++) {
			//initialize nested for loop
			for (int j = 0; j < num2.length; j++) {
				//Initialize if condition
				if (num1[i]==num2[j]) {
					//Print the values
					System.out.println(num1[i]);
					
				}
			}
		}
		
	}
}
