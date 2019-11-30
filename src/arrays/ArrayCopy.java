package arrays;

public class ArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[]={"12","18","49","15","78","89","85"};
String b[]=new String [5];
System.arraycopy(a, 2, b, 0, 5);
for(int i=0;i<b.length;i++){
	System.out.println(b[i]);
}
	}

}
