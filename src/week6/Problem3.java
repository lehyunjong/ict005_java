package week6;

import java.util.Scanner;

public class Problem3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double[] arr = {85.6,79.5,83.1,80.0,78.2,75.0};
	int input1 = input.nextInt();
	int input2 = input.nextInt();
	double sum = arr[input1-1]+arr[input2-1];
	double z = sum*10;
	System.out.print(z/10);
}
}
