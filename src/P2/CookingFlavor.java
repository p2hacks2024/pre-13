/**
 * 
 */
package P2;

import java.util.Random;


public class CookingFlavor {

	static String[] myFlavors = new String[6] ;

	public static void startDrawElseCards(String[] arg) {
		String[] cards = { "醤油","醤油","味噌","豆板醬","だし","ネギ","ネギ","肉","肉","キノコ" };
		Random r = new Random();
		
		for(int i=0 ; i<2 ; i++) {
			String card = cards[r.nextInt(10)];
			myFlavors[i] = card;

			if(card == "醤油") {
				//醤油の画像を座標i(仮)に表示、豆腐からずらす
			}
			//他のカード分も作る

		}
	}
	
	
	public static void drawElseCards(String[] args) {
		String[] cards = { "醤油","醤油","味噌","豆板醬","だし","ネギ","ネギ","肉","肉","キノコ" };
		Random r = new Random();
		int haveFlavor = 0;
		for(int j = 0;j < myFlavors.length;j++) {
			if(myFlavors[j] == null) {
				haveFlavor = j;
				break;
			}
		}
		for(int i=0 ; i<2 ; i++) {
			String card = cards[r.nextInt(10)];
			myFlavors[i + haveFlavor] = card;

			if(card == "醤油") {
				//醤油の画像を座標i(仮)に表示、豆腐からずらす
			}
			//他のカード分も作る

		}
		for(int i =0;i < 6;i++) {
			if(myFlavors[i] != null) {
				System.out.println(myFlavors[i]);
			}
		}
	}

}
