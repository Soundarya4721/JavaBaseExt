package arrays;

public class JaggedArray {

	
	//An array with odd  number of columns that is different number of rows and columns
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int[4][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[3]=new int[5];
		arr[2]=new int[7];
		int count=0;
		for(int a=0;a<arr.length;a++){
			for(int b=0;b<arr[a].length;b++){
				arr[a][b]=count++;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]+" ");
			}
			
			
			System.out.println();
		}

	}

}
