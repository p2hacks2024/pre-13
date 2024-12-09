
package P2;

import java.util.Random;

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
    
		SelectFlavor.SelectUsingFlavor();

    CPU.cpuTradeCards();
		//CPU.cpuSelectFlavor
	}
}