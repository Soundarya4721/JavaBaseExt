package arrays;

public class Multidimensionalarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=1;
		arr[2][1]=2;
		arr[2][2]=3;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
