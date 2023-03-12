package week1Assignmennt;

public class PrintOddNumbers {
	public static void main(String[] args) {
	//Declare int array	
	int [] num= {5,8,4,9,3,2,6,1,7};
	//Initialize for loop
	for (int i = 0; i <= num.length; i++) {
		//Initialize if condition
		if (i%2!=0) {
			//Print the Values
			System.out.println(i);
			
		}
		
	}
	

}
}