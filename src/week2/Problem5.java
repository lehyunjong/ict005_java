package week2;
import java.io.PrintStream;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double cm;
		double x;
		
		System.out.println("yard? ");
		double yard =input.nextDouble();
		cm = 91.44 * yard;
		x = Math.round(10*cm);
		
		System.out.println(yard+"yard ="+x/10+"cm");
//		System.out.println(yard+"yard ="+String.format("%.1f", cm)+"cm");
		
	}

}
