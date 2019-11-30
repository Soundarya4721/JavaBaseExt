package oopsConcepts_object;

public class ObjectByMethod {

	/**
	 * @param args
	 */
	//creating a method for object Reference
	String student;
	double RollNum;
	
	void DisplayInformation(int r,String s){
		student=s;
		RollNum=r;
		System.out.println(student);
	System.out.println(RollNum);	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ObjectByMethod obm=new ObjectByMethod();
obm.DisplayInformation(123, "soundarya");
	}

}
