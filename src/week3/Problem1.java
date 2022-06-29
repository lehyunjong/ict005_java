package week3;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		boolean a = x > y;
		boolean b = x < y;
		boolean c = x >= y;
		boolean d = x <= y;
		if(a==true) {
			System.out.println(x+" > "+y+" --- 1");	
		}
		else {
			System.out.println(x+" > "+y+" --- 0");
		}
		if(b==true) {
			System.out.println(x+" < "+y+" --- 1");
		}
		else {
			System.out.println(x+" < "+y+" --- 0");
		}
		if(c==true) {
			System.out.println(x+" >= "+y+" --- 1");
		}
		else {
			System.out.println(x+" >= "+y+" --- 0");
		}
		if(d==true) {
			System.out.println(x+" <= "+y+" --- 1");
		}
		else {
			System.out.println(x+" <= "+y+" --- 0");
		}

		
	}

}
