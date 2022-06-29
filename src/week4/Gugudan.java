package week4;
import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("원하는 구구단의 단을 입력하세요: ");
		 int x = input.nextInt();
		  
		 int i = 2;
		 while( i<10 ) {
			 System.out.println(x+" * "+ i +" = "+ x*i );
			 i=i+2;

			 
	}
	}
}
