package week4;

import java.util.Scanner;

public class ConditionProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x>0) {
			System.out.println("plus");
		}
		else if(x==0) {
			System.out.println("zero");
		}
		else{
			System.out.println("minus");
		}
	}

}
