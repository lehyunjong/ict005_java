package week5;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt =0;
		int sum =0;
		for(int i=1;sum<n;i++) {
			if(i%2==1) {
				sum+=i;
				cnt++;
			}
		}
		System.out.printf("%d %d",cnt,sum);
	}

}
