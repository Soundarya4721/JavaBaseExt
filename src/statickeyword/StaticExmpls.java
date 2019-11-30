package statickeyword;

public class StaticExmpls {

	int rollno;
	String name;
	static String college="BITS";
	
	public StaticExmpls(int r,String n) {
		rollno=r;
		name=n;
		System.out.println(college);
		System.out.println(rollno);
		System.out.println(name);
		
		
		
	}
	//Static Method
	public static void methodExmp() {
		college="VIT College";
		System.out.println(college);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExmpls sts=new StaticExmpls(111, "soumi");
		StaticExmpls stu=new StaticExmpls(133, "sasi");	
		stu.methodExmp();
	}
}
