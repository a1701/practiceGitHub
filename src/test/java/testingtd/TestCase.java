package testingtd;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
public static void main(String[] args) {
		
		List<Integer> items= new ArrayList<Integer>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
		items.remove(1);
		items.remove(1);
		
		items.remove( new Integer(1)) ;
		System.out.println(items);
		
		for (int i = 0; i < items.size(); i++) {
System.out.println("Hello World!");	

//comments are included
		}
	}
}
