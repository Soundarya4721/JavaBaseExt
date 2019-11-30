package arrays;

public class PassingArrayToMethod {

	/**
	 * @param args
	 */
	
	public static void ArrayaMethod(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassingArrayToMethod pas=new PassingArrayToMethod();
		int a[]={12,18,25,69,45,89,95};
		pas.ArrayaMethod(a);

	}

}
