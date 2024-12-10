
package P2;

// カード情報

public class Main{

	public static void main(String[] args) {
		CookingFlavor.startDrawElseCards(args); //プレイヤーが最初に引く調味料2枚
		CPU.startCpuDrawElseCards(args); //CPUが最初に引く調味料2枚

		//while(true){
		Tohu.drawTohuCards(args); //プレイヤーが豆腐を引く
		CookingFlavor.drawElseCards(args); //プレイヤーが調味料を２枚引く
		System.out.println(); 

		Hungry.increaseHungry(); //両プレイヤーの空腹ゲージ
		System.out.println();

		CPU.cpuDrawTohuCards(args); //CPUが豆腐を引く
		CPU.cpuDrawElseCards(args); //CPUが調味料を２枚引く
		System.out.println();

		//--------------------------------------
		// playerのターン
		//System.out.println("Playerのターンです");
		//--------------------------------------
		
		TradeCards.TradeCard(); //プレイヤーがカードを交換する
		DecideCards.convertNumber(); //食材に素数を与える
		DecideCards.calculateTohu(); //持っている豆腐を判別
		DecideCards.calculateFlavor(); //持っている調味料を判別
		DecideRoles.decideRoleNumber(); //役判別
		DecideDishes.selectDishes(); //勝負する料理の決定
		//SelectFlavor.canCreateDish();
		//dishNumberで色々処理できるはず

		GameResult.attackDamage(false); //ダメージの計算
		if(GameResult.finalResult() == 0) { //満腹かどうか判断
			//break;
		}

		//-----------------------------------
		// CPUのターン
		//System.out.println("CPUのターンです");
		//-----------------------------------
		
		//CPU.cpuTradeCards(); //CPUがカードを交換する（以下CPUの判定）
		//CpuDecideCards.cpuConvertNumber(); //食材に素数を与える
		//CpuDecideCards.cpuCalculateTohu(); //持っている豆腐を判別
		//CpuDecideCards.cpuCalculateFlavor(); //持っている調味料を判別
		
		//CpuDecideRoles.cpuDecideRoleNumber(); //役判別
		//CpuDecideDishes.cpuSelectDishes(); //勝負する料理の決定

		GameResult.attackDamage(true); //ダメージの計算
		if(GameResult.finalResult() == 0) { //満腹かどうか判断
			//break;
		}
		
	}
}