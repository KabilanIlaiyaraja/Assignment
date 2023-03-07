package week3.day2;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		
		int []num= {5,4,8,2,7,1,3,9};
		Arrays.sort(num);
		int a=0;
		for (int i = 1; i <=9; i++) {
		 a=a+i;
			
		}
		int b=0;
		for (int i = 0; i < num.length; i++) {
		 b=b+num[i];
			
		}
		int sum=a-b;
		System.out.println("Missing Element is "+sum);
	}

}
