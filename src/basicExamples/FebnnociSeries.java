package basicExamples;

public class FebnnociSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int count=10;
int result=0;
System.out.println(a);
System.out.println(b);
for(int i=0;i<=count;i++){


	result=a+b;
	//System.out.println(result);
	a=b;
	b=result;
	System.out.println(result);
}
	}

}
