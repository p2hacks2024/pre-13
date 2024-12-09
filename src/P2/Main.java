/**
 * 
 */
package P2;

import java.util.Random;

// カード情報

public class Main{
	
	public static void main(String[] args) {

		Tohu.drawTohuCards(args);
		CookingFlavor.drawElseCards(args);
		TradeCards.TradeCard();
		DecideCards.convertNumber();
		DecideCards.calculateTohu();
		DecideCards.calculateFlavor();
		DecideRoles.decideRoleNumber();
		SelectFlavor.SelectUsingFlavor();

	}
}