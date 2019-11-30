package oopsConcepts_Collections;
import java.util.ArrayList;
import java.util.List;

//Creating arraylist from another collection using arraylist(collection c) constructor


public class ArrayListFromAnotherCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Integer> First = new ArrayList<>();

		First.add(1);
		First.add(2);
		First.add(5);
		First.add(6);
		System.out.println(First);
		
		
		//Creating arraylist from another arraylist
		List<Integer> Second=new ArrayList<Integer>(First);
		Second.add(-1);
		Second.add(-2);
		Second.add(-3);
		System.out.println(Second);
		
		
		
		
		
		
	}

}
