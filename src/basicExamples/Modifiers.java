package basicExamples;

public class Modifiers {

	/**
	 * @param args
	 */
	private static double num1=25.12;
	private static double num2=85.45;
	
	protected  double addition(double num1,double num2){
		
		num1=this.num1;
		num2=this.num2;
		double result=num1+num2;
		
		System.out.println(result);
		return result;
		
	}
	

	
	public static double getNum1() {
		return num1;
	}



	public static void setNum1(double num1) {
		Modifiers.num1 = num1;
	}



	public static double getNum2() {
		return num2;
	}



	public static void setNum2(double num2) {
		Modifiers.num2 = num2;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers mod=new Modifiers();
		mod.addition(num1,num2);
		

	}

}
