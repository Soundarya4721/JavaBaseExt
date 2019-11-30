package basicExamples;

import java.awt.List;
import java.util.Arrays;
import java.util.Random;

public class RandomCharecterGeneration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alpha="abcdefghijklmnopqrstuvwxyz";
		String Value="";
Random rand=new Random();
//int strlen=rand.nextInt();
 
int count=4;
for (int i = 0; i <=count-1; i++) {
    char c = alpha.charAt(rand.nextInt(26));
    Value+=c;
}
 
System.out.println("VPA"+Value);


	}

}
