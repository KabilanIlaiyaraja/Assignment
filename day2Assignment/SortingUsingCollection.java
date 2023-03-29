package week6.day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		
		String [] company= {"Google","Microsoft","TestLeaf","Maverick"};
		int length = company.length;
		System.out.println(length);
		List<String> mnc=new ArrayList<String>();
		for (int i = 0; i < company.length; i++) {
			mnc.add(company[i]);
			
		}
		Collections.sort(mnc);
		System.out.println(mnc);
		Collections.reverse(mnc);
		System.out.println(mnc);
		
		
		
		
	}

}
