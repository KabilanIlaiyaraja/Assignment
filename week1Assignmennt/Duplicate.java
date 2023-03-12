package week1Assignmennt;

import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {
		//Declare Int arrays
		int [] num= {11,55,77,66,55,33,11,44,22};
		//sort the values as ascending
		Arrays.sort(num);
		//Initialize for loop
		for (int i = 0; i < num.length; i++) {
			//Initialize nested for loop
			for (int j = i+1; j < num.length; j++) {
				//Initialize if condition
				if (num[i]==num[j]) {
					//print the iterate values
					System.out.println(num[i]);
					
				}
				
			}
			
		}
	}

}
