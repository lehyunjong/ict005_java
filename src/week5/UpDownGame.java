package week5;
import java.util.Random;
import java.util.Scanner;
public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~100 ������ ���ڸ� ������� ���ڸ� ���� ���ÿ�.");


		Random rand = new Random();
		int iValue = rand.nextInt(100)+1;
		//		for(int i =0 ; i<100000000 ; i++ )
		//		for(;;)//(=���ѷ��� , i�� ����� ������ ������ ��� �Ѵ�.)
		int i =1;
		while(true)//(���϶����� ��� �ݺ��ض�=���ѷ��� , i�� ����� ������ ������ ��� �Ѵ�.

		{

			Scanner input = new Scanner(System.in);
			System.out.print("���� �Է�>");
			int user = input.nextInt();	

			if (user > iValue){
				System.out.println("Ʋ�Ƚ��ϴ�. �� ���� ���� �Է��ϼ���");
			}
			else if (user == iValue) {
				System.out.println("�����Դϴ�!!,"+ i +"�� ���� ���߼̽��ϴ�.");
				break;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�. �� ū ���� �Է��ϼ���");
			}
			i++;
		}

	}

}
