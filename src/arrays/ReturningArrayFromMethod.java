package arrays;

public class ReturningArrayFromMethod {

	/**
	 * @param args
	 */
	
	public static int[] get(){//returning array
		return new int[]{10,52,36,78};	
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=get();
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
	}

}
