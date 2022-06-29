package week4;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = 0;
		for(int x=1 ; x<=10 ; x++) {
			z = z + x;
//			z += x; // 위에 있는 식과 정확히 같은 형태(= 누적의 표현)
		}
		System.out.println("합계="+z);
	
	}

}
