package week6;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("6명의 몸무게를 입력하시오: ");
//		double w1 = input.nextDouble();
//		double w2 = input.nextDouble();
//		double w3 = input.nextDouble();
//		double w4 = input.nextDouble();
//		double w5 = input.nextDouble();
//		double w6 = input.nextDouble();
//		System.out.println((w1+w2+w3+w4+w5+w6)/6.0);
//		
		double[] weights = new double[6];
		
		//사용자의 입력을 처리하는 반복문
		for(int i = 0 ; i < weights.length ; i++) {
			weights[i] = input.nextDouble();
		}
		//몸무게의 합을 계산하는 반복문
		double sum = 0;
		for(int i = 0 ; i < weights.length ; i++) {
			sum += weights[i];
		}
		double avg = sum/weights.length;
		
//		avg = Math.round(avg*10);
		System.out.print("몸무게의 평균: "+ String.format("%.1f", avg));
//		System.out.print("몸무게의 평균: "+(avg/10));
//		System.out.print("몸무게의 평균: "+(sum/weights.length));
		
	}

}
