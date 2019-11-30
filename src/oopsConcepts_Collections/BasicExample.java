package oopsConcepts_Collections;

public class BasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,8,4,5};
		//Printing an element in an array
		for(int i=0;i<a.length;i++) {
			
			//System.out.println(a[i]);
			
			for(int j=i+1;j<a.length;j++)
			{
				//System.out.println(a[j]);
				
			
			
			if(a[i]<a[j]) {
				int temp=a[i];//temp=1
				a[i]=a[j];//a[i]=2
				a[j]=temp;//a[j]=1
			}
			}
			System.out.println(a[i]);
			
			

		}

	}

}
