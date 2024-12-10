
package P2;

// カード情報

public class Main{

	public static void main(String[] args) {
		CookingFlavor.startDrawElseCards(args);
		CPU.startCpuDrawElseCards(args);
    
		//while()
		Tohu.drawTohuCards(args);
		CookingFlavor.drawElseCards(args);
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
		SelectFlavor.canCreateDish();
		//dishNumberで色々処理できるはず

    CPU.cpuTradeCards();
		//CPU.cpuSelectFlavor
	}
}