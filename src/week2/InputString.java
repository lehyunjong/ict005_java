package week2;
import java.util.Scanner;
public class InputString {
	public static void main(String[] arg) {	
		String name;
		int age;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = sc.nextLine();
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = sc.nextInt();
		System.out.println(name+"�� �ȳ��ϼ���!"+ (age)+"���̽ó׿�");
	}
}
