package week6;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = new int[2][4];

		int[][] arr2 = new int[2][4];

		int[][] arr3 = new int[2][4];

		Scanner in = new Scanner(System.in);

		System.out.println("first array");

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 4; j++) {

				arr1[i][j] = in.nextInt();

			}

		}

		System.out.println("second array");

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 4; j++) {

				arr2[i][j] = in.nextInt();

			}

		}



		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 4; j++) {

				arr3[i][j] = arr1[i][j] * arr2[i][j];

				System.out.print(arr3[i][j] + " ");

			}

			System.out.println();

		}

	}

}

