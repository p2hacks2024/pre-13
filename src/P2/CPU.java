package P2;

import java.util.Random;

public class CPU {

	static String[] CpuCards = new String[5];
	static String[] cpuFlavors = new String[6] ;
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

	public static void startCpuDrawElseCards(String[] arg) {
		String[] cards ={ "醤油","醤油","醤油","味噌","味噌","味噌","辛味調味料","辛味調味料","出汁","出汁","出汁","出汁","出汁","肉","肉","肉","肉",
				"ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","ネギ","葉物野菜","葉物野菜","葉物野菜","葉物野菜","葉物野菜","根菜","根菜","根菜","根菜","根菜","根菜" };
		Random r = new Random();

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
		int haveFlavor = 0;
		for(int j = 0;j < cpuFlavors.length;j++) {
			if(cpuFlavors[j] == null) {
				haveFlavor = j;
				break;
			}
		}
		for(int i=0 ; i<2 ; i++) {
			String card = cards[r.nextInt(10)];
			cpuFlavors[i + haveFlavor] = card;

			if(card == "醤油") {
				//醤油の画像を座標i(仮)に表示、豆腐からずらす
			}
			//他のカード分も作る

		}
		for(int i =0;i < 6;i++) {
			if(cpuFlavors[i] != null) {
				//System.out.println("???");
				System.out.println(cpuFlavors[i]);
			}
		}
	}

	public static void cpuTradeCards() {
		int sp = 0,ha = 0, di = 0, cl = 0;
		for(int i = 0;i < 5;i++) {
			if(CpuCards[i].equals("スペード")) {
				sp++;
			}else if(CpuCards[i].equals("ハート")) {
				ha++;
			}else if(CpuCards[i].equals("ダイヤ")) {
				di++;
			}else if(CpuCards[i].equals("クラブ")){
				cl++;
			}
		}
		int[] change = {0,0,0};
		int changeNamber = 0;
		if(sp == 1) {
			for(int i = 0;i < 5;i++) {
				if(CpuCards[i].equals("スペード")) {
					System.out.println("CPUはスペードを食べた");
					change[changeNamber] = i;
					changeNamber++;
				}
			}
		}
		if(di == 1) {
			for(int i = 0;i < 5;i++) {
				if(CpuCards[i].equals("ダイヤ")) {
					System.out.println("CPUはダイヤを食べた");
					change[changeNamber] = i;
					changeNamber++;
				}
			}
		}
		if(ha == 1) {
			for(int i = 0;i < 5;i++) {
				if(CpuCards[i].equals("ハート")) {
					System.out.println("CPUはハートを食べた");
					change[changeNamber] = i;
					changeNamber++;
				}
			}
		}
		if(cl == 1) {
			for(int i = 0;i < 5;i++) {
				if(CpuCards[i].equals("クラブ")) {
					System.out.println("CPUはクラブを食べた");
					change[changeNamber] = i;
					changeNamber++;
				}
			}
		}
		for(int i = 0;i < changeNamber;i++) {
			CpuCards[change[i]] = Tohu.cards[r.nextInt(3)];
		}
		if(changeNamber== 0) {
			System.out.println("CPUは何も食べなかった");
		}

		for(int i = 0; i < 5;i++) {
			//System.out.println(CpuCards[i]);
		}
	}
}