package week3;
import java.util.Scanner;
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("�簢���� ���θ� �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.println("�簢���� ���θ� �Է��Ͻÿ�: ");
		b = input.nextInt();
		
		int area,perimeter;
		area = a*b;
		perimeter = 2*(a+b);
		System.out.println("�簢���� ���̴�"+area);
		System.out.println("�簢���� �ѷ���"+perimeter);
	}

}
