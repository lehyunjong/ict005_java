package week3;
import java.util.Scanner;
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("사각형의 가로를 입력하시오: ");
		a = input.nextInt();
		System.out.println("사각형의 세로를 입력하시오: ");
		b = input.nextInt();
		
		int area,perimeter;
		area = a*b;
		perimeter = 2*(a+b);
		System.out.println("사각형의 넓이는"+area);
		System.out.println("사각형의 둘레는"+perimeter);
	}

}
