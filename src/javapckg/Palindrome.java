package javapckg;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=121;
int a=0;
int sum=0;
int temp;
temp=n;
while(n>0){
	a=n%10;
	sum=(sum*10)+a;
	n=n/10;
	System.out.println(sum);
	if(temp==sum){
		System.out.println("palindrome");
	}
	
}
	}

}
