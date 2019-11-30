package arrays;

public class AdditionOfMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]={{1,2},{2,3}};
		int b[][]={{2,5},{5,6}};
		int c[][]=new int[2][2];
		
		for(int i=0;i<a.length;i++){
			for(int k=0;k<a.length;k++){
				
				c[i][k]=a[i][k]*b[i][k];
			System.out.print(c[i][k]+" ");
			}
			
			
			System.out.println();
		}
		
		

	}

}
