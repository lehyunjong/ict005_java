package week4;
import java.util.Scanner;
public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("���� ������ �Է��Ͻÿ�: " );
		int x = input.nextInt();	
		for(int y = 1; y<=x ; y++  )
			if(x%y == 0) {
				System.out.print(y+" ");
			}
			
			
		}
	}
	

