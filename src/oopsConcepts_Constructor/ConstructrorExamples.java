package oopsConcepts_Constructor;

public class ConstructrorExamples {

	/**
	 * @param args
	 */
	
	public ConstructrorExamples(){
		System.out.println("this is an example of constructor");
		System.out.println("----------------------------------");
		System.out.println("there are two types of constructors:default and parametrised");
		System.out.println("--------------------------------------------------------------");
		System.out.println("A constructor must be having same name as class");
		System.out.println("-------------------------------------------------");
		System.out.println("if there is no default constructor,a default construtor will be invoked automatically");
	    System.out.println("---------------------------------------------------------------------------------------");
	    System.out.println("a default constructor is used to provide default values such as null,0");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructrorExamples conex=new ConstructrorExamples();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Even if the constructor is not called explicitly it is executed unlike method");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("This Example can be reffered as an example of default constructor");

	}

}
