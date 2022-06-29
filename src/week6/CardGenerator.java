package week6;

import java.util.Random;

public class CardGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] card_shapes = {"Clubs","Diamonds","Hearts","Spades"};
		Random rand = new Random();
		String[] number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		Random x = new Random();

		//		0<+= Random.nextInt(number) < number
		for(int i = 0 ; i < 5 ; i++) {
			int index = rand.nextInt(card_shapes.length); //4
			int y = x.nextInt(number.length);
			System.out.println(card_shapes[index]+"ÀÇ "+number[y]);
		}


	}
}