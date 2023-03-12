package week1Assignmennt;

public class ReverseUsingStringBuffer {

	public static void main(String[] args) {
		//Declare String using String buffer
		StringBuffer name=new StringBuffer("Kabilan");
		//Initialize Another String value using Append
		name.append(" Ilaiyaraja");
		//Reverse the string
		StringBuffer reverse = name.reverse();
		//Declare string length
		int length=reverse.length();
		//Print the length
		System.out.println(length);
		String string = reverse.toString();
		//Initialize String to upper case.
		String upperCase = string.toUpperCase();
		//Print the Upper case.
		
		System.out.println(upperCase);
		
	}
}
