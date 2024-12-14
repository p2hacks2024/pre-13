
/**
 * 
 */
package P2;

import java.util.Random;


public class Tohu extends CookingFlavor{

	static String[] cards = { "木綿豆腐", "卵豆腐", "絹ごし豆腐", "ゲーミング豆腐" };
	static String[] myCards = new String[5];
	static Random r = new Random();

	public static String getMyCards(int a) {
		return myCards[a];
	}

	public static void drawTohuCards() {
		System.out.println("Playerのカード");
		for(int i=0 ; i<5 ; i++) {
			String card = cards[r.nextInt(4)];
			System.out.println(card);
			myCards[i] = card;

			if(card == "スペード") {
				//スペードの画像を座標i(仮)に表示
			}
			//他のカード分も作る

		}
	}

	public static void setupTohuCards() {
		System.out.println("Playerのカード");
		for(int i=0 ; i<5 ; i++) {
			String card = cards[r.nextInt(4)];
			System.out.println(card);
			myCards[i] = card;


		}
	}

}
