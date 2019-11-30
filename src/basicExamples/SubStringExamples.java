
package basicExamples;

public class SubStringExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Sasidhar Konduri";
System.out.println(s.toUpperCase());
System.out.println(s.substring(2));
System.out.println(s.substring(2, 6));
System.out.println(s.charAt(2));


//wrapper classes
String age="34";
String sal="74898.12";
int a=Integer.parseInt(age)+2;
System.out.println(a);

double b=Double.parseDouble(sal)/12;
System.out.println(b);
	}

}
