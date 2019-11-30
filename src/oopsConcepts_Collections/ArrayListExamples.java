package oopsConcepts_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

//implements java list(interface) interface.
//uses dynamic array to store duplicate elements of different data types.
//grows its size when a new element is added
//array list internally uses array to store the elements.
//shrinks the size when elements are removed.
//allows duplicate and null values
//ordered collection follows insertion order
//cannot create primitve data types as int,char etc should use the boxed data types like
//Integer,Charecter,Boolean



//Create array list using Arraylist() constructor; 
public class ArrayListExamples {
	
	public ArrayListExamples() {
		// TODO Auto-generated constructor stub
		
		List<String> names=new ArrayList();
		names.add("soundarya");
		names.add("sasidhar");
		names.add("sudheer");
		names.add("teja");
		names.add(3,"sai");

		System.out.println(names);
		
		
		//Iterating through Foreach loop
		for(String names1:names) {
			
			System.out.println(names1);
		}
        // Adding an element at a particular index in an ArrayList

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayListExamples ae=new ArrayListExamples();

	}

}
