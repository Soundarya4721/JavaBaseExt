package oopsConcepts_object;

public class ObjectByReference {

	/**
	 * @param args
	 */
	//Initializing the object through a reference variable
	String s="soumi";
	int a=156;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ObjectByReference obr=new ObjectByReference();
obr.a=154;
obr.s="hi soundarya";
System.out.println(obr.a);
System.out.println(obr.s);


//We can also create multiple objects by using multiple reference variables
ObjectByReference obr2=new  ObjectByReference();
obr2.a=234;
System.out.println(obr2.a);
System.out.println(obr2.s);


	}

}
