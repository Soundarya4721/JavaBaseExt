package basicExamples;

public class ReverseofStringWithoutStringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String s="good morning people";
		char [] m=s.toCharArray();
System.out.println(m);

int a=s.length()-1;
//System.out.println(a);
for(int i=a;i>=0;i--){
	//System.out.println("inside loop");
	
System.out.println(m[i]);

	}

}
}