package week5;
import java.util.Random;
import java.util.Scanner;
public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~100 사이의 숫자를 골랐으니 숫자를 맞춰 보시오.");


		Random rand = new Random();
		int iValue = rand.nextInt(100)+1;
		//		for(int i =0 ; i<100000000 ; i++ )
		//		for(;;)//(=무한루프 , i를 대신할 변수를 설정해 줘야 한다.)
		int i =1;
		while(true)//(참일때까지 계속 반복해라=무한루프 , i를 대신할 변수를 설정해 줘야 한다.

		{

			Scanner input = new Scanner(System.in);
			System.out.print("숫자 입력>");
			int user = input.nextInt();	

			if (user > iValue){
				System.out.println("틀렸습니다. 더 작은 수를 입력하세요");
			}
			else if (user == iValue) {
				System.out.println("정답입니다!!,"+ i +"번 만에 맞추셨습니다.");
				break;
			}
			else {
				System.out.println("틀렸습니다. 더 큰 수를 입력하세요");
			}
			i++;
		}

	}

}
