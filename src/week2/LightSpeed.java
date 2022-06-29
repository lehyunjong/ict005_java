package week2;

public class LightSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double speed = 3.0E+5;
		double distance = 4.0e+13;
		double time;
		time = distance / speed;
		double lightspeedyear = time / (60*60*24*365);
		System.out.println("걸리는 시간은"+lightspeedyear+ "광년입니다.");
		
		
				
	}

}
