package week4;
import java.util.Scanner;
public class RockScissorPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		가위: 0 , 바위:1 , 보자기:2
		System.out.println("가위, 바위, 보 중에 하나를 입력하시오(가위: 0 , 바위:1 , 보자기:2):");
		int user = input.nextInt();
		
		System.out.println("user>"+user);
		
		int computer = (int)(3*Math.random());//난수
		System.out.println("computer>"+computer);
    	if(user == computer)
			{
			System.out.println("draw!0");
			}
		else {
		if(user == 0 )	{
			if(computer ==1) {
				System.out.println("computer win!");
			}
			else if (computer == 2) {
				System.out.println("user win!");
			}
		}
		else if(user == 1 ) {
			if(computer == 0) {
				System.out.println("user win!");
			}
			else if (computer == 2) {
				System.out.println("computer win!");
			}
		}
			else if(user == 2 ) {
				if(computer == 0) {
					System.out.println("computer win!");
				}
				else if (computer == 1) {
					System.out.println("user win!");
				}
			}
		}
	}
}
		
		
	
	
	
	

	
