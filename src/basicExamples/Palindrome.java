package basicExamples;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   result=n%10;  //getting remainder  
		   sum=(sum*10)+result;    
		   n=n/10;  
		   System.out.println(sum);
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		   System.out.println(sum);
		  
	}

}
