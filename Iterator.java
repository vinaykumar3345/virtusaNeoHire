ITERATOR


import java.util.*;
public class Iterator {
	public static void main(String[] args) {
		
	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
	
		Iterator it=numbers.iterator();
		while (it.hasNext())
			System.out.println(it.next()+" ");
	}
	}