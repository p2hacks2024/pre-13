/**
 * 
 */
package P2;

import java.util.Random;


public class Tohu {

	public static void drawTohuCards(String[] args) {
	    String[] cards = { "スペード", "ダイヤ", "ハート", "クラブ" };
	    Random r = new Random();
	    for(int i=0 ; i<5 ; i++) {
	      String card = cards[r.nextInt(3)];
	      System.out.println(card);
	      
	      if(card == "スペード") {
	    	  //スペードの画像を座標i(仮)に表示
	      }
	    //他のカード分も作る
	      
	    }
	  }
	
	
}
