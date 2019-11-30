package oops_Inheritence;

class Employee{
	static float Salary=10000;
	
}



public class InheritenceExmpls extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	InheritenceExmpls IE=new InheritenceExmpls();
	IE.Salary=12000;
	System.out.println(Salary);
		
	}

}
