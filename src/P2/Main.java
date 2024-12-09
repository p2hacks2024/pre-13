
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

		TradeCards.TradeCards();
		DecideCards.convertNumber();
		DecideCards.calculateTohu();
		DecideCards.calculateFlavor();
		DecideRoles.decideRoleNumber();
<<<<<<< HEAD
		DecideDishes.selectDishes();
		SelectFlavor.canCreateDish();
		//dishNumberで色々処理できるはず
=======
    
		SelectFlavor.SelectUsingFlavor();
>>>>>>> f858078e35168de04ad5b47ac371e9ecc1befece

    CPU.cpuTradeCards();
		//CPU.cpuSelectFlavor
	}
}