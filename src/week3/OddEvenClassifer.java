package week3;
import java.util.Scanner;
public class OddEvenClassifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int number = input.nextInt(); // 사용자로부터 정수 값 획득
		
		if(number % 2 == 0 ) // 조건이 참이 되었을때 "짝수입니다"
		{ 
			System.out.println("짝수입니다.");
//			System.out.println("프로그램이 종료되었습니다.");
		}
		else
		{
			System.out.println("홀수입니다.");
//			System.out.println("프로그램이 종료되었습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
