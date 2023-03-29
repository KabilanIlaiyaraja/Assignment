package week6.day2Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		
		int []data= {5,8,2,4,1,9,15,3,5,11,7,12};
		Set<Integer> num=new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			num.add(data[i]);
			
		}
		System.out.println(num);
		List<Integer> number=new ArrayList<Integer>(num);
		System.out.println(number.get(number.size()-2));
	}

}
