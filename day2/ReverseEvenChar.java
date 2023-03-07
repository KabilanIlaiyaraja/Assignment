package week3.day2;

public class ReverseEvenChar {

	public static void main(String[] args) {
		
		String name="Kabilan";
		
		for(int i=name.length()-1;i>0;i--) {
			
		
			if(name.charAt(i)%2==1) {
				System.out.println(name.charAt(i));
				
			}
			
		}
	}

}
