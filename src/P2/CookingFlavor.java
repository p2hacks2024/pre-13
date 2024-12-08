/**
 * 
 */
package P2;

import java.util.Random;


	public class CookingFlavor {

	static String[] myFlavors = new String[2];

	public static void drawElseCards(String[] args) {
	    String[] cards = { "醤油","醤油","味噌","豆板醬","だし","ネギ","ネギ","肉","肉","キノコ" };
	    Random r = new Random();
	    for(int i=0 ; i<2 ; i++) {
	      String card = cards[r.nextInt(10)];
	      System.out.println(card);
	      myFlavors[i] = card;
	      
	      if(card == "醤油") {
	    	  //醤油の画像を座標i(仮)に表示、豆腐からずらす
	      }
	    //他のカード分も作る
	      
	    }
	  }
	
}
