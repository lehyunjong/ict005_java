package week4;

import java.util.Scanner;

public class LoopPracticeProblem6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x,width,base,height;
		while(true) {
			System.out.print("Base = ");
			base = input.nextDouble();
			System.out.print("Height = ");
			height = input.nextDouble();
			width = (base*height)/2;
			x = Math.round(10*width);
			System.out.println("Triangle width = " + (x/10));
			System.out.print("Continue? ");
			input.nextLine();
			String con = input.next();
			if(!con.equals("Y") && !con.equals("y")) {
				break;
			}

		}
		
		
	}

}
