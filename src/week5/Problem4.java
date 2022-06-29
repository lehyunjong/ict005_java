package week5;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int p = input.nextInt();
		int i;
		int j;
		for(i=1 ; i<=p ; i++) {
			for( j=1 ; j<=i ; j++ ) {

				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
