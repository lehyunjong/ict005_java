package week3;
import java.util.Scanner;
public class OddEvenClassifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int number = input.nextInt(); // ����ڷκ��� ���� �� ȹ��
		
		if(number % 2 == 0 ) // ������ ���� �Ǿ����� "¦���Դϴ�"
		{ 
			System.out.println("¦���Դϴ�.");
//			System.out.println("���α׷��� ����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("Ȧ���Դϴ�.");
//			System.out.println("���α׷��� ����Ǿ����ϴ�.");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
