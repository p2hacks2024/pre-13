/**
 * 
 */
package P2;

import java.util.Random;


public class Tohu extends CookingFlavor{

	static String[] cards = { "スペード", "ダイヤ", "ハート", "クラブ" };
	static String[] myCards = new String[5];
	static Random r = new Random();

	public static void drawTohuCards(String[] args) {
		for(int i=0 ; i<5 ; i++) {
			String card = cards[r.nextInt(3)];
			System.out.println(card);
			myCards[i] = card;

			if(card == "スペード") {
				//スペードの画像を座標i(仮)に表示
			}
			//他のカード分も作る

		}
	}


}
