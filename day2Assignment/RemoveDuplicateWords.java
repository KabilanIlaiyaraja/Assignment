package week6.day2Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> word=new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			word.add(split[i]);
		}
		System.out.println(word);
		
		
		
		
		
	}

}
