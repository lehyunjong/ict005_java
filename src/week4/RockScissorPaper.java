package week4;
import java.util.Scanner;
public class RockScissorPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		����: 0 , ����:1 , ���ڱ�:2
		System.out.println("����, ����, �� �߿� �ϳ��� �Է��Ͻÿ�(����: 0 , ����:1 , ���ڱ�:2):");
		int user = input.nextInt();
		
		System.out.println("user>"+user);
		
		int computer = (int)(3*Math.random());//����
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
		
		
	
	
	
	

	
