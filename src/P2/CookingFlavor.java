/**
 * 
 */
package P2;

import java.util.Random;


public class CookingFlavor extends Hungry{

	static String[] myFlavors = new String[8];
	static int numberOfCards = 0;
	static String[] cards = { "醤油","醤油","醤油","味噌","味噌","味噌","辛味調味料","辛味調味料","出汁","出汁","出汁","出汁","出汁","肉","肉","肉","肉",
			"ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","葉物野菜","葉物野菜","葉物野菜","葉物野菜","葉物野菜","根菜","根菜","根菜","根菜","根菜","根菜" };
	public static String getMyFlavor(int a) {
		return myFlavors[a];
	}

	public static void startDrawElseCards() {
		
		for(int i = 0;i < 8;i ++) {
			myFlavors[i] = null;
		}
		numberOfCards = 0;
		Random r = new Random();

		for(int i=0 ; i<2 ; i++) {
			String card = cards[r.nextInt(34)];
			//System.out.println(card);
			numberOfCards++;
			myFlavors[i] = card;

			if(card == "醤油") {
				//醤油の画像を座標i(仮)に表示、豆腐からずらす
			}
			//他のカード分も作る

		}
		for(int i =0;i < numberOfCards;i++) {
			//System.out.println(myFlavors[i]);
		}
	}

	public static void drawElseCards() {
		String[] cards =  { "醤油","醤油","醤油","味噌","味噌","味噌","辛味調味料","辛味調味料","出汁","出汁","出汁","出汁","出汁","肉","肉","肉","肉",
				"ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","葉物野菜","葉物野菜","葉物野菜","葉物野菜","葉物野菜","根菜","根菜","根菜","根菜","根菜","根菜" };
		Random r = new Random();
		if(numberOfCards == 7) {
			for(int i=0 ; i<1 ; i++) {
				String card = cards[r.nextInt(34)];
				myFlavors[i + numberOfCards] = card;
				if(card == "醤油") {
					//醤油の画像を座標i(仮)に表示、豆腐からずらす
				}
				//他のカード分も作る
				numberOfCards+=1;
			}
		}else if(numberOfCards == 8){
		}else {
			for(int i=0 ; i<2 ; i++) {
				String card = cards[r.nextInt(34)];
				myFlavors[i + numberOfCards] = card;
				if(card == "醤油") {
					//醤油の画像を座標i(仮)に表示、豆腐からずらす
				}
				//他のカード分も作る
			}
			numberOfCards+=2;
		}
		for(int i =0;i < numberOfCards;i++) {
			System.out.println(myFlavors[i]);
		}
	}

	/*public static void getCookingFlavors() {
		for(int i =0;i < numberOfCards;i++) {
			System.out.println(myFlavors[i]);
		}
	}*/

	public static void printMyFlavors() {
		for(int i =0;i < numberOfCards;i++) {
			System.out.println(myFlavors[i]);
		}
	}

}
