package week1Assignmennt;

public class PrintEvenWords {
	public static void main(String[] args) {
		//Declare String sentence
		String text="I am software tester ";
		//Split the sentence to each word
		String[] str=text.split(" ");
		//Initialize for loop
		for (int i = 0; i < str.length; i++) 
		{
			//initialize if condition
			if (i%2!=0) 
			{
				//Print the values
				System.out.println(str[i]);
			
			}		
}
}
}
