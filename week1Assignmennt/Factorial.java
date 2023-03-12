package week1Assignmennt;

public class Factorial {
	public static void main(String[] args) {
		//Declare int values
		int a=8;
		//initialize fact values as 1
		int fact=1;
		//Initialize for loop
		for (int i = 1; i <=a; i++) {
			//iterate the values & store the values in fact
			fact=fact*i;
		}
		//print the fact values 
		System.out.println("Factorial of 8 is "+fact);
	}

}
