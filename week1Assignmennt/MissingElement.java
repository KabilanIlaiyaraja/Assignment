package week1Assignmennt;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		//Declare int  array values
		int[] number= {5,7,9,3,6,1,4,2};
		//sort the values as ascending
		Arrays.sort(number);
		//Initialize for loop
		for (int i = 0; i < number.length; i++) {
			//initialize if condition,Iteration not equal to i+1
			if (number[i]!=i+1) {
				//Print the  missing number i+1
				System.out.println("Missing number is "+(i+1));
				break;
			}
			
		}
	}

}
