
package P2;

// カード情報

public class Main{

	public static void main(String[] args) {
		CookingFlavor.startDrawElseCards(args);
		CPU.startCpuDrawElseCards(args);

		//while()
	     new Display();
		
		Tohu.drawTohuCards(args);

		CookingFlavor.drawElseCards(args);
		System.out.println();
		Hungry.increaseHungry();
		System.out.println();

		CPU.cpuDrawTohuCards(args);
		CPU.cpuDrawElseCards(args);
		System.out.println();

		TradeCards.TradeCard();
		DecideCards.convertNumber();
		DecideCards.calculateTohu();
		DecideCards.calculateFlavor();
		DecideRoles.decideRoleNumber();
		DecideDishes.selectDishes();
		//SelectFlavor.canCreateDish();
		//dishNumberで色々処理できるはず

		GameResult.attackDamage();
		GameResult.finalResult();
		
		//CookingFlavor.getCookingFlavors();

		//CPU.cpuTradeCards();
		//CPU.cpuSelectFlavor

	}
}