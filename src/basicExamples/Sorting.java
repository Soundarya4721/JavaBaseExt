package basicExamples;

public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,7,-78,4};
		int b=a.length;
		int temp;
		for(int i=0;i<=5 ;i++){
			for(int j=0;j<=b-1;j++){
				if(a[j-1]>a[j]){
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					System.out.println(a[j]);
				}
			}
		}

	}

}
