
package P2;

import java.util.Random;

public class CPU extends Hungry{

	static String[] CpuCards = new String[5];
	static String[] cpuFlavors = new String[8] ;
	static int cpuNumberOfCards = 0;
	static Random r = new Random();

	public static void cpuDrawTohuCards(String[] args) {
		System.out.println("CPUのカード");
		for(int i=0 ; i<5 ; i++) {
			String card = Tohu.cards[r.nextInt(3)];
			//System.out.println("?????");
			System.out.println(card);
			CpuCards[i] = card;

			if(card == "スペード") {
				//スペードの画像を座標i(仮)に表示
			}
			//他のカード分も作る

		}
	}

	public static String getCpuCards(int a) {
		return CpuCards[a];
	}

	public static void startCpuDrawElseCards(String[] arg) {
		String[] cards ={ "醤油","醤油","醤油","味噌","味噌","味噌","辛味調味料","辛味調味料","出汁","出汁","出汁","出汁","出汁","肉","肉","肉","肉",
				"ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","葉物野菜","葉物野菜","葉物野菜","葉物野菜","葉物野菜","根菜","根菜","根菜","根菜","根菜","根菜" };
		Random r = new Random();
		for(int i = 0;i < 8;i ++) {
			cpuFlavors[i] = null;
		}
		cpuNumberOfCards=2;
		for(int i=0 ; i<2 ; i++) {
			String card = cards[r.nextInt(34)];
			cpuFlavors[i] = card;

			if(card == "醤油") {
				//醤油の画像を座標i(仮)に表示、豆腐からずらす
			}
			//他のカード分も作る

		}
	}


	public static void cpuDrawElseCards(String[] args) {
		String[] cards ={ "醤油","醤油","醤油","味噌","味噌","味噌","辛味調味料","辛味調味料","出汁","出汁","出汁","出汁","出汁","肉","肉","肉","肉",
				"ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","葉物野菜","葉物野菜","葉物野菜","葉物野菜","葉物野菜","根菜","根菜","根菜","根菜","根菜","根菜" };
		Random r = new Random();
		cpuNumberOfCards+=2;
		int haveFlavor = 0;
		for(int j = 0;j < cpuFlavors.length;j++) {
			if(cpuFlavors[j] == null) {
				haveFlavor = j;
				break;
			}
		}
		if(haveFlavor == 7) {
			for(int i=0 ; i<1 ; i++) {
				String card = cards[r.nextInt(34)];
				cpuFlavors[i + haveFlavor] = card;
				if(card == "醤油") {
					//醤油の画像を座標i(仮)に表示、豆腐からずらす
				}
				//他のカード分も作る
			}
		}else if (haveFlavor == 8){
		}else {
			for(int i=0 ; i<2 ; i++) {
				String card = cards[r.nextInt(34)];
				cpuFlavors[i + haveFlavor] = card;
				if(card == "醤油") {
					//醤油の画像を座標i(仮)に表示、豆腐からずらす
				}
				//他のカード分も作る
			}
		}
		for(int i =0;i < 8;i++) {
			if(cpuFlavors[i] != null) {
				//System.out.println("???");
				System.out.println(cpuFlavors[i]);
			}else {
				break;
			}
		}
	}

	public static void getCpuCards() {
		for(int i=0 ; i<5 ; i++) {
			//System.out.println("?????");
			System.out.println(CpuCards[i]);
		}
	}

	public static void cpuTradeCards() {
		int sp = 0,ha = 0, di = 0, cl = 0;
		for(int i = 0;i < 5;i++) {
			if(CpuCards[i].equals("木綿豆腐")) {
				sp++;
			}else if(CpuCards[i].equals("絹ごし豆腐")) {
				ha++;
			}else if(CpuCards[i].equals("卵豆腐")) {
				di++;
			}else if(CpuCards[i].equals("ゲーミング豆腐")){
				cl++;
			}
		}
		int[] change = {0,0,0};
		int changeNamber = 0;
		if(CPUCurrentGauge <45) {
			if(sp == 1) {
				for(int i = 0;i < 5;i++) {
					if(CpuCards[i].equals("木綿")) {
						System.out.println("CPUは木綿豆腐を食べた");
						change[changeNamber] = i;
						changeNamber++;
						CPUHungryGauge[CPUCurrentGauge] = "■";
						CPUCurrentGauge++;
					}
				}
			}
			if(di == 1) {
				for(int i = 0;i < 5;i++) {
					if(CpuCards[i].equals("卵豆腐")) {
						System.out.println("CPUは卵豆腐を食べた");
						change[changeNamber] = i;
						changeNamber++;
						CPUHungryGauge[CPUCurrentGauge] = "■";
						CPUCurrentGauge++;
					}
				}
			}
			if(ha == 1) {
				for(int i = 0;i < 5;i++) {
					if(CpuCards[i].equals("絹ごし")) {
						System.out.println("CPUは絹ごし豆腐を食べた");
						change[changeNamber] = i;
						changeNamber++;
						CPUHungryGauge[CPUCurrentGauge] = "■";
						CPUCurrentGauge++;
					}
				}
			}
			if(cl == 1) {
				for(int i = 0;i < 5;i++) {
					if(CpuCards[i].equals("ゲーミング豆腐")) {
						System.out.println("CPUはゲーミング豆腐を食べた");
						change[changeNamber] = i;
						changeNamber++;
						CPUHungryGauge[CPUCurrentGauge] = "■";
						CPUCurrentGauge++;
					}
				}
			}
		}
		for(int i = 0;i < changeNamber;i++) {
			CpuCards[change[i]] = Tohu.cards[r.nextInt(3)];
		}
		if(changeNamber== 0) {
			System.out.println("CPUは何も食べなかった");
		}
		System.out.println();
		System.out.print("自分の満腹ゲージ：");
		for(int i = 0; i < 50; i++) {
			System.out.print(myHungryGauge[i]);
		}
		System.out.print("\n");

		System.out.print("CPUの満腹ゲージ：");
		for(int i = 0; i < 50; i++) {
			System.out.print(CPUHungryGauge[i]);
		}
		System.out.print("\n");
		for(int i = 0; i < 5;i++) {
			//System.out.println(CpuCards[i]);
		}
	}
}
