package oopsConcepts_object;

public class CreatingMultipleObjectsByoneType {

	/**
	 * @param args
	 */
	public static void BankDetails(){
		double amount=12000;
		String HolderName="soundarya";
		double rate=12.5;
		double fd=amount/rate*100;
		System.out.println(HolderName+" "+fd);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CreatingMultipleObjectsByoneType cd=new CreatingMultipleObjectsByoneType(),cd2=new CreatingMultipleObjectsByoneType();

cd.BankDetails();
cd2.BankDetails();
	}

}
