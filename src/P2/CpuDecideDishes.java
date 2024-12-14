package P2;

import java.util.Scanner;

public class CpuDecideDishes extends CpuDecideRole{

	
	static boolean cpux = false;
	static boolean cpuy = false;
	static boolean cpuz = false;
	static int cpualpha = 0;
	static String cpuDish;
	
	public static String getCpuDish() {
		return cpuDish;
	}

	public static void cpuSelectDishes() { //料理ごとに数値を設定

		cpux = false;
		cpuy = false;
		cpuz = false;
		cpualpha = 0;

		//System.out.println("どの料理を作りますか？ <料理名を入力>");
		//System.out.println("作らない場合は <作らない>と入力");
		//Scanner selectDish = new Scanner(System.in);
		//String dish = selectDish.next();

		if(cpuFlavorX % 207727 == 0 || cpuFlavorX % 222053 == 0 || cpuFlavorX % 265031 == 0	||
				cpuFlavorX % 237367 == 0 || cpuFlavorX % 283309 == 0 || cpuFlavorX % 338143 == 0) { //大盛鍋
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "出汁" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //出汁を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "肉" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //肉を削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
				if((cpuFlavors[i] == "ネギ" || cpuFlavors[i] == "根菜" || cpuFlavors[i] == "葉物野菜") && cpualpha < 2) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-3]; //なんでも野菜を削除
					cpuFlavors[cpuNumberOfCards-3] = null; //後ろから三、四番目の調理カードと入れ替え
					cpualpha++;
				}
			}
			cpuNumberOfCards-=4;
			nextGauge = 5;
			cpuDish = "大盛り鍋";
			System.out.println("CPUは大盛り鍋を作った");
		}else if(cpuFlavorX % 9139 == 0) { //味噌煮込み豆腐
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "味噌" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards - 1]; //味噌を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "出汁" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //出汁を削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
				if(cpuFlavors[i] == "根菜" && cpuz == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-3]; //根菜を削除
					cpuFlavors[cpuNumberOfCards-3] = null; //後ろから三番目の調理カードと入れ替え
					cpuz = true;
				}
			}
			cpuNumberOfCards-=3;
			cpuDish = "味噌煮込み豆腐";
			System.out.println("CPUは味噌煮込み豆腐を作った");
			nextGauge = 4;
		}else if(cpuFlavorX % 12673 == 0 || cpuFlavorX % 13547 == 0 || cpuFlavorX % 16169 == 0) { //鍋
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "出汁" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //出汁を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "肉" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //肉を削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
				if((cpuFlavors[i] == "ネギ" || cpuFlavors[i] == "根菜" || cpuFlavors[i] == "葉物野菜") && cpuz == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-3]; //なんでも野菜を削除
					cpuFlavors[cpuNumberOfCards-3] = null; //後ろから三番目の調理カードと入れ替え
					cpuz = true;
				}
			}
			cpuNumberOfCards-=3;
			cpuDish = "鍋";
			System.out.println("CPUは鍋を作った");
			nextGauge = 4;
		}else if(cpuFlavorX % 7163 == 0 || cpuFlavorX % 7657 == 0) { //味噌汁
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "味噌" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //味噌を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "出汁" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //出汁を削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
				if((cpuFlavors[i] == "ネギ" || cpuFlavors[i] == "葉物野菜") && cpuz == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-3]; //なんでも野菜を削除
					cpuFlavors[cpuNumberOfCards-3] = null; //後ろから三番目の調理カードと入れ替え
					cpuz = true;
				}
			}
			cpuNumberOfCards-=3;
			cpuDish = "味噌汁";
			System.out.println("CPUは味噌汁を作った");
			nextGauge = 4;
		}else if(cpuFlavorX % 551 == 0) { //出汁ジュレ冷奴
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "出汁" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //出汁を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "ネギ" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //ネギを削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
			}
			cpuNumberOfCards-=2;
			System.out.println("CPUは出汁ジュレ冷奴を作った");
			nextGauge = 3;
		}else if(cpuFlavorX % 527 == 0) { //辛味豆腐サラダ
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "辛味調味料" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //辛味調味料を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "葉物野菜" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //葉物野菜を削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
			}
			cpuNumberOfCards-=2;
			cpuDish = "辛味豆腐サラダ";
			System.out.println("CPUは辛味豆腐サラダを作った");
			nextGauge = 3;
		}else if(cpuFlavorX % 407 == 0) { //豆腐の煮物
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "醤油" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //醤油を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "根菜" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //根菜を削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
			}
			cpuNumberOfCards-=2;
			cpuDish = "豆腐の煮物";
			System.out.println("CPUは豆腐の煮物を作った");
			nextGauge = 3;
		}else if(cpuFlavorX % 391 == 0) { //麻婆豆腐
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "辛味調味料" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //辛味調味料を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "肉" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //肉を削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
			}
			cpuNumberOfCards-=2;
			cpuDish = "麻婆豆腐";
			System.out.println("CPUは麻婆豆腐を作った");
			nextGauge = 3;
		}else if(cpuFlavorX % 319 == 0) { //ネギ乗せ冷奴
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "醤油" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //醤油を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
				if(cpuFlavors[i] == "ネギ" && cpuy == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-2]; //ネギを削除
					cpuFlavors[cpuNumberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
					cpuy = true;
				}
			}
			cpuNumberOfCards-=2;
			cpuDish = "ネギ乗せ冷奴";
			System.out.println("CPUはネギ乗せ冷奴を作った");
			nextGauge = 3;
		}else if(cpuFlavorX % 29 == 0) { //焼き豆腐
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "ネギ" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //ネギを削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
			}
			cpuNumberOfCards--;
			cpuDish = "焼き豆腐";
			System.out.println("CPUは焼き豆腐を作った");
			nextGauge = 2;
		}else if(cpuFlavorX % 23 == 0) { //豆腐ハンバーグ
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "肉" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //肉を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
			}
			cpuNumberOfCards--;
			cpuDish = "豆腐ハンバーグ";
			System.out.println("CPUは豆腐ハンバーグを作った");
			nextGauge = 2;
		}else if(cpuFlavorX % 13 == 0) { //豆腐の味噌漬け
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "味噌" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //味噌を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
			}
			cpuNumberOfCards--;
			cpuDish = "豆腐の味噌漬け";
			System.out.println("CPUは豆腐の味噌漬けを作った");
			nextGauge = 2;
		}else if(cpuFlavorX % 11 == 0) { //冷奴
			for (int i = 0; i < cpuNumberOfCards; i++) {
				if(cpuFlavors[i] == "醤油" && cpux == false) {
					cpuFlavors[i] = cpuFlavors[cpuNumberOfCards-1]; //醤油を削除
					cpuFlavors[cpuNumberOfCards-1] = null; //一番後ろの調理カードと入れ替え
					cpux = true;
				}
			}
			cpuNumberOfCards--;
			cpuDish = "冷奴";
			System.out.println("CPUは冷奴を作った");
			nextGauge = 2;
		}else { //作らない
			nextGauge = 1;
			cpuDish = "なし";
			System.out.println("CPUは何も作らなかった");
		}
		CPU.getCpuCards();
		System.out.println();
	}
}