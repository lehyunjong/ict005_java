package week5;
import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		������¸� �����.
		//		����ڷκ��� n�� �Է¹޾� nxn�� ��� ���¸� �����.
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int n = input.nextInt();
		int number = 1; 
		int row = 0;
		while(row <n) {
			row++;
			for(int col=0 ; col < n ; col++) {
				System.out.print(number%10 + " ");
				number += 2;	
			}
			System.out.println();












			//		for(int row=0; row < n ; row++) {
			//			for(int col=0 ; col < n ; col++) {
			//				System.out.print(number%10 + " ");
			//				number = number + 2;
			//				number += 2;
		}
		//			System.out.println();
		//		}

	}

}
