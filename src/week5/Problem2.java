package week5;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b) {
            for(int i = 1; i < 10; i++) {
                for(int j = a; j >= b; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j*i);
                }
                System.out.println();
            }
        } else {
            for(int i = 1; i < 10; i++) {
                for(int j = a; j <= b; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j*i);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
