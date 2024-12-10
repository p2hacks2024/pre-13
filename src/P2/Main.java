
package P2;

// カード情報

public class Main{

	public static void main(String[] args) {

		Tohu.drawTohuCards(args);
		CookingFlavor.startDrawElseCards(args);
		Hungry.increaseHungry();
		TradeCards.TradeCard();
		DecideCards.convertNumber();
		DecideCards.calculateTohu();
		DecideCards.calculateFlavor();
		DecideRoles.decideRoleNumber();
		DecideDishes.selectDishes();
		SelectFlavor.canCreateDish();
		//dishNumberで色々処理できるはず
		GameResult.attackDamage();
		GameResult.finalResult();
		
	}
}