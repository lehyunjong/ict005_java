package week6;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] arr = new int[10];



		for (int i = 0; i < arr.length; i++) {

			arr[i] = input.nextInt();

		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (min > arr[i])

				min = arr[i];

		}

		System.out.println(min);

	}

}