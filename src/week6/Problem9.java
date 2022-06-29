package week6;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        int sum = 0;

        for(int i = 0; i < 4; i++) {
            System.out.print(i + 1 + "class? ");

           for(int j = 0; j < 3; j++) {
               arr[i][j] = sc.nextInt();
           }
        }
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            System.out.println(i + 1 + "class : " + sum);
            sum = 0;
        }

        sc.close();
    }

	
	}


