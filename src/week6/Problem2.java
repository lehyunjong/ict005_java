package week6;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("6���� �����Ը� �Է��Ͻÿ�: ");
//		double w1 = input.nextDouble();
//		double w2 = input.nextDouble();
//		double w3 = input.nextDouble();
//		double w4 = input.nextDouble();
//		double w5 = input.nextDouble();
//		double w6 = input.nextDouble();
//		System.out.println((w1+w2+w3+w4+w5+w6)/6.0);
//		
		double[] weights = new double[6];
		
		//������� �Է��� ó���ϴ� �ݺ���
		for(int i = 0 ; i < weights.length ; i++) {
			weights[i] = input.nextDouble();
		}
		//�������� ���� ����ϴ� �ݺ���
		double sum = 0;
		for(int i = 0 ; i < weights.length ; i++) {
			sum += weights[i];
		}
		double avg = sum/weights.length;
		
//		avg = Math.round(avg*10);
		System.out.print("�������� ���: "+ String.format("%.1f", avg));
//		System.out.print("�������� ���: "+(avg/10));
//		System.out.print("�������� ���: "+(sum/weights.length));
		
	}

}
