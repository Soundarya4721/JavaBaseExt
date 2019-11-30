package javapckg;

public class Febnocci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,count,n;

count=5;
System.out.println(n1);
System.out.println(n2);

for(int i=0;i<=count;i++)
{
	n=n1+n2;
	System.out.println(n);
	n1=n2;
	n2=n;
	
}


	}

}
