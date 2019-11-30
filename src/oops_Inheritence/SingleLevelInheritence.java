package oops_Inheritence;

class Dog{
	
	static String Quality="Barks";
}

class Cat extends Dog{
	static String type="Domestic";
}



public class SingleLevelInheritence extends Cat{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLevelInheritence si=new SingleLevelInheritence();
		//Quality="Runs";
		System.out.println(Quality);
		type="Wild";
		System.out.println(type);
		

	}

}
