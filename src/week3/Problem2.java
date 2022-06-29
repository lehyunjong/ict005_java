package week3;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		if((x > y) && (x > z)) {
    		System.out.print(" 1");
    	} else {
    		System.out.print(" 0");
    	}
    	
    	if((x == y) && (x == z)) {
    		System.out.print(" 1");
    	} else {
    		System.out.print(" 0");
    	}
    	
    	
		
		
		 


}
}