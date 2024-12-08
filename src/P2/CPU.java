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
			System.out.println(card);
			CpuCards[i] = card;

			if(card == "スペード") {
				//スペードの画像を座標i(仮)に表示
			}
			//他のカード分も作る

		}
	}
	
	public static void startCpuDrawElseCards(String[] arg) {
		String[] cards = { "醤油","醤油","味噌","豆板醬","だし","ネギ","ネギ","肉","肉","キノコ" };
		Random r = new Random();
		
		for(int i=0 ; i<2 ; i++) {
			String card = cards[r.nextInt(10)];
			cpuFlavors[i] = card;

			if(card == "醤油") {
				//醤油の画像を座標i(仮)に表示、豆腐からずらす
			}
			//他のカード分も作る

		}
	}
	
	
	public static void cpuDrawElseCards(String[] args) {
		String[] cards = { "醤油","醤油","味噌","豆板醬","だし","ネギ","ネギ","肉","肉","キノコ" };
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
				System.out.println(cpuFlavors[i]);
			}
		}
	}

}