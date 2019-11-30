package basicExamples;

public class AmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Armstrong Number  
		/*123-(1*1*1)=1
		 * (2*2*2)=8
		 * (3*3*3)=27
		 *
		 * */
		int c=0,a,temp;  
	    int n=153;//It is the number to check armstrong  
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");  
	    System.out.println(c);
		
	}	
		
		
		
		 
	}


