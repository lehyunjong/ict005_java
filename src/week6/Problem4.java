package week6;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		int sum1 = 0;
		double sum2 = 0;
		for(int i =0; i <arr.length;i++) {
			arr[i] = input.nextInt();
			if(i%2==0) {
				sum2 += arr[i];
			}
			else {
				sum1 += arr[i];
			}
		}
	
		System.out.println("sum: "+sum1);
		System.out.printf("avg: %.1f",sum2/5);
	}

}
