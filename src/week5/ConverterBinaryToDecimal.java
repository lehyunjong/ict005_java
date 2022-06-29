package week5;

public class ConverterBinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1001";
//		System.out.println(number);
//		System.out.println("Length of string"+number.length());
//		System.out.println("character of index 0: "+ number.charAt(0));
//		System.out.println("character of index 3: "+ number.charAt(3));
//		int temp = Integer.parseInt(number.charAt(0)+"");
//		System.out.println(temp);
		int sum = 0;
		int lengthOfString = number.length();
		
//		for(int i = 0 ; i < lengthOfString ; i++) {
//			int digit = Integer.parseInt(number.charAt(i)+"");
//			sum += digit * (int)Math.pow(2, lengthOfString-1-i);
			
//		}
		int i = 0;
		while(i<lengthOfString) {
			int digit = Integer.parseInt(number.charAt(i)+"");
			sum += digit * (int)Math.pow(2, lengthOfString-1-i);
			i++;
		}
		System.out.println("Convert: "+number+"(2) ¡í"+sum);
		
		
		
		
		
	}

}
