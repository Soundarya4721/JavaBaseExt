package oopsConcepts_Collections;

import java.util.ArrayList;
import java.util.List;

public class AddAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//cREATING First ArrayList
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(3);
		a1.add(26);
		a1.add(67);
		System.out.println(a1);
		
		//Creating Second Arraylist by merging with the firt arraylist
		
		List<Integer> a2=new ArrayList<Integer>(a1);
		a2.add(34);
		a2.add(45);
		//Creating array list for using addall() method
		System.out.println(a2);
		
		
		List<Integer> a3=new ArrayList<Integer>();
		a3.add(23);
		a3.add(56);
		System.out.println(a3);
		
		//using add all method
		a2.addAll(a3);
		System.out.println(a2);
		
		
		

	}

}
