package week3;
import java.util.Scanner;
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		int number = input.nextInt();
		
		if(number > 0) {
			System.out.println("����Դϴ�.");
		}
		else if (number == 0) {
			System.out.println("0�Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
		
	}

}
