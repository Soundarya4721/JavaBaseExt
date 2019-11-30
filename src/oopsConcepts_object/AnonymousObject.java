package oopsConcepts_object;

public class AnonymousObject {

	/**
	 * @param args
	 */
	
	public void factorial(int count){
		int fact=1;
		for(int i=1;i<=count;i++){
		fact=fact*i;	
		System.out.println(fact);
		}	
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new AnonymousObject().factorial(5);

	}

}
