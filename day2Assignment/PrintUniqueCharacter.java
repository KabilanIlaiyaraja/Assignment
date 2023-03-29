package week6.day2Assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		
		String name="Kabilan";
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		Set<Character> word=new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean value = word.add(charArray[i]);
			if (!value) {
				word.remove(charArray[i]);
				
			}
		}
		System.out.println(word);
	}

}
