
package P2;

import java.util.Scanner;

// カード情報

public class Main{

	public static void main(String[] args) {
		boolean Playerturn = false;
		boolean CPUturn = false;
		int gameRestart = 0,gameFlow = 0;
		String[] seed = {""};
		//start
		setup();
		new Display();
		while(true) {
			//			if(gameRestart == 0) {
			//				System.out.println("操作を入力してください : 1.ゲームを始める 2.ゲームを閉じる");
			//				Scanner scanMain = new Scanner(System.in);
			//				gameFlow = scanMain.nextInt();
			//			}
			//			System.out.println();
			if(Display.getVsPanelVisible() == true) {
				//				if(gameFlow == 1) {
				
				CPU.startCpuDrawElseCards(seed); //CPUが最初に引く調味料2枚

				//--------------------------------------
				// 対戦開始
				System.out.println("対戦を開始します");
				//--------------------------------------

				System.out.println();
				Hungry.increaseHungry(); 
				System.out.println();

				while(true){
					//					if(Playerturn == false&&CPUturn == false) {
					Tohu.drawTohuCards(); //プレイヤーが豆腐を引く
					CookingFlavor.drawElseCards(); //プレイヤーが調味料を２枚引く
					System.out.println(); 

					////両プレイヤーの空腹ゲージ
					//System.out.println();

					CPU.cpuDrawTohuCards(seed); //CPUが豆腐を引く
					CPU.cpuDrawElseCards(seed); //CPUが調味料を２枚引く
					Playerturn = true;
					//					}

					System.out.println();
					//					if(Playerturn == true) {
					//--------------------------------------
					// playerのターン
					System.out.println("Playerのターンです\n");
					//--------------------------------------

					//					TradeCards.TradeCard(); //プレイヤーがカードを交換する
					DecideCards.convertNumber(); //食材に素数を与える
					DecideCards.calculateTohu(); //持っている豆腐を判別
					DecideCards.calculateFlavor(); //持っている調味料を判別
					DecideRoles.decideRoleNumber(); //役判別
					DecideDishes.selectDishes(); //勝負する料理の決定
					//SelectFlavor.canCreateDish();
					//dishNumberで色々処理できるはず
					Playerturn =false;
					CPUturn = true;
					//					}
					GameResult.attackDamage(false); //ダメージの計算
					if(GameResult.finalResult() == 0) { //満腹かどうか判断
						break;
					}

					//CookingFlavor.printMyFlavors();

					//					if(CPUturn ==true) {
					//-----------------------------------
					// CPUのターン
					System.out.println("CPUのターンです\n");
					//-----------------------------------

					CPU.cpuTradeCards(); //CPUがカードを交換する（以下CPUの判定）
					System.out.println();

					CpuDecideCards.cpuConvertNumber(); //食材に素数を与える
					CpuDecideCards.cpuCalculateTohu(); //持っている豆腐を判別
					CpuDecideCards.cpuCalculateFlavor(); //持っている調味料を判別

					CpuDecideRole.cpuDecideRoleNumber(); //役判別
					CpuDecideDishes.cpuSelectDishes(); //勝負する料理の決定
					//					}
					GameResult.attackDamage(true); //ダメージの計算
					if(GameResult.finalResult() == 0) { //満腹かどうか判断
						break;
					}
				}
				Hungry.endHungry();
				System.out.println();
				System.out.println("ゲームを続けますか : 1.続ける 2.タイトルへ戻る");
				Scanner scanEnd = new Scanner(System.in);
				int gameEnd = scanEnd.nextInt();
				if(gameEnd == 1) {
					gameRestart = 1;
				}else if(gameEnd == 2){
					gameRestart = 0;
				}
			}
			//			}else if(gameFlow == 2) {
			//				break;
			//			}
		}
	}
	
	public static void setup() {
		CookingFlavor.startDrawElseCards(); //プレイヤーが最初に引く調味料2枚
		Tohu.setupTohuCards();
		Hungry.setupHungryGauge();
	}
	public static void turnend() {
//		Display.vsSetup();
	}
}
