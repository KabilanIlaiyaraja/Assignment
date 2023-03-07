package week3.day2;

public class OddUppercase 
{
	public static void main(String[] args) 
	{
		
		String name="kabilraja";
		String upperCase = name.toUpperCase();
		for (int i = 0; i < upperCase.length(); i++) 
		{
			if (i%2==0) 
			{
				System.out.print(upperCase.charAt(i));
			}
			
		}
	}

}
