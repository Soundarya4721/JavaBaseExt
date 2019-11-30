package oopsConcepts_Collections;

import java.util.ArrayList;
import java.util.List;

public class AccessingElementsfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> charlist=new ArrayList<Character>();
		
		//To check whether the array list is empty
System.out.println(charlist.isEmpty()+"-" + "The list is empty");

		 
		
		charlist.add('q');
		charlist.add('r');
		charlist.add('w');
	charlist.add('e');
	charlist.add('t');
	charlist.add('y');
	
	//To retrieve the size of arary list
	
	System.out.println("The size of arraylist is "+" "+charlist.size());
	
    // Retrieve the element at a given index

	char q=charlist.get(0);
	System.out.println(q);
	char r=charlist.get(1);
	System.out.println(r);
	char v=charlist.get((charlist.size()-1));
	System.out.println(v);
	
    // Modify the element at a given index
charlist.set(2, 'f');
System.out.println(charlist);
	 
	}

}
