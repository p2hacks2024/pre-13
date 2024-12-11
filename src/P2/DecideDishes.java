package P2;

import java.util.Scanner;

public class DecideDishes extends DecideRoles{

	static int dishNumber = 100;
	static boolean canCreate = false;

	public static void selectDishes() { //料理ごとに数値を設定

		canCreate = false;
		
		while(canCreate == false) {

			System.out.println("どの料理を作りますか？ <料理名を入力>");
			System.out.println("作らない場合は <作らない>と入力");
			Scanner selectDish = new Scanner(System.in);
			String dish = selectDish.next();

			if(dish.equals("冷奴")) {
				dishNumber = 0;
			}
			if(dish.equals("豆腐の味噌漬け")) {
				dishNumber = 1;
			}
			if(dish.equals("豆腐ハンバーグ")) {
				dishNumber = 2;
			}
			if(dish.equals("焼き豆腐")) {
				dishNumber = 3;
			}
			if(dish.equals("ネギ乗せ冷奴")) {
				dishNumber = 4;
			}
			if(dish.equals("麻婆豆腐")) {
				dishNumber = 5;
			}
			if(dish.equals("豆腐の煮物")) {
				dishNumber = 6;
			}
			if(dish.equals("辛味豆腐サラダ")) {
				dishNumber = 7;
			}
			if(dish.equals("出汁ジュレ冷奴")) {
				dishNumber = 8;
			}
			if(dish.equals("味噌汁")) {
				dishNumber = 9;
			}
			if(dish.equals("鍋")) {
				dishNumber = 10;
			}
			if(dish.equals("味噌煮込み豆腐")) {
				dishNumber = 11;
			}
			if(dish.equals("大盛り鍋")) {
				dishNumber = 12;
			}
			if(dish.equals("作らない")) {
				dishNumber = 100;
			}

			if(dishNumber == 0) { //冷奴
				if(FlavorX % 11 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "醤油") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //醤油を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
					}
					System.out.println("冷奴を作って勝負します");
					nextGauge = 2;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 1) { //豆腐の味噌漬け
				if(FlavorX % 13 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "味噌") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //味噌を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
					}
					System.out.println("豆腐の味噌漬けを作って勝負します");
					nextGauge = 2;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 2) { //豆腐ハンバーグ
				if(FlavorX % 23 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "肉") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //肉を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
					}
					System.out.println("豆腐ハンバーグを作って勝負します");
					nextGauge = 2;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 3) { //焼き豆腐
				if(FlavorX % 29 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "ネギ") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //ネギを削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
					}
					System.out.println("焼き豆腐を作って勝負します");
					nextGauge = 2;
					canCreate = true;
					break;
				}
			}

			//具材2つ

			if(dishNumber == 4) { //ネギ乗せ冷奴
				if(FlavorX % 319 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "醤油") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //醤油を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "ネギ") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //ネギを削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
					}
					System.out.println("ネギ乗せ冷奴を作って勝負します");
					nextGauge = 3;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 5) { //麻婆豆腐
				if(FlavorX % 391 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "辛味調味料") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //辛味調味料を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "肉") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //肉を削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
					}
					System.out.println("麻婆豆腐を作って勝負します");
					nextGauge = 3;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 6) { //豆腐の煮物
				if(FlavorX % 407 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "醤油") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //醤油を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "根菜") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //根菜を削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
					}
					System.out.println("豆腐の煮物を作って勝負します");
					nextGauge = 3;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 7) { //辛味豆腐サラダ
				if(FlavorX % 527 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "辛味調味料") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //辛味調味料を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "葉物野菜") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //葉物野菜を削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
					}
					System.out.println("辛味豆腐サラダを作って勝負します");
					nextGauge = 3;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 8) { //出汁ジュレ冷奴
				if(FlavorX % 551 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "出汁") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //出汁を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "ネギ") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //ネギを削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
					}
					System.out.println("出汁ジュレ冷奴を作って勝負します");
					nextGauge = 3;
					canCreate = true;
					break;
				}
			}

			//具材3つ

			if(dishNumber == 9) { //味噌汁
				if(FlavorX % 7163 != 0 || FlavorX % 7657 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "味噌") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //味噌を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "出汁") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //出汁を削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
						if(myFlavors[i] == "ネギ" || myFlavors[i] == "葉物野菜" ) {
							myFlavors[i] = myFlavors[numberOfCards-3]; //なんでも野菜を削除
							myFlavors[numberOfCards-3] = null; //後ろから三番目の調理カードと入れ替え
						}
					}
					System.out.println("味噌汁を作って勝負します");
					nextGauge = 4;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 10) { //鍋
				if(FlavorX % 12673 != 0 || FlavorX % 13547 != 0 || FlavorX % 16169 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "出汁") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //出汁を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "肉") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //肉を削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
						if(myFlavors[i] == "ネギ" || myFlavors[i] == "根菜" || myFlavors[i] == "葉物野菜" ) {
							myFlavors[i] = myFlavors[numberOfCards-3]; //なんでも野菜を削除
							myFlavors[numberOfCards-3] = null; //後ろから三番目の調理カードと入れ替え
						}
					}
					System.out.println("鍋を作って勝負します");
					nextGauge = 4;
					canCreate = true;
					break;
				}
			}
			if(dishNumber == 11) { //味噌煮込み豆腐
				if(FlavorX % 9139 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "味噌") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //味噌を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "出汁") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //出汁を削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
						if(myFlavors[i] == "根菜") {
							myFlavors[i] = myFlavors[numberOfCards-3]; //根菜を削除
							myFlavors[numberOfCards-3] = null; //後ろから三番目の調理カードと入れ替え
						}
					}
					System.out.println("味噌煮込み豆腐を作って勝負します");
					nextGauge = 4;
					canCreate = true;
					break;
				}
			}

			//具材4つ

			if(dishNumber == 12) { //大盛り鍋
				if(FlavorX % 207727 != 0 || FlavorX % 222053 != 0 || FlavorX % 265031 != 0
						||FlavorX % 237367 != 0 || FlavorX % 283309 != 0 || FlavorX % 338143 != 0) {
					System.out.println("この料理は作れません"); //やり直し
				}else {
					for (int i = 0; i < numberOfCards; i++) {
						if(myFlavors[i] == "出汁") {
							myFlavors[i] = myFlavors[numberOfCards-1]; //出汁を削除
							myFlavors[numberOfCards-1] = null; //一番後ろの調理カードと入れ替え
						}
						if(myFlavors[i] == "肉") {
							myFlavors[i] = myFlavors[numberOfCards-2]; //肉を削除
							myFlavors[numberOfCards-2] = null; //後ろから二番目の調理カードと入れ替え
						}
						if(myFlavors[i] == "ネギ" || myFlavors[i] == "根菜" || myFlavors[i] == "葉物野菜" ) {
							myFlavors[i] = myFlavors[numberOfCards-3]; //なんでも野菜を削除
							myFlavors[numberOfCards-3] = null; //後ろから三、四番目の調理カードと入れ替え
						}
					}
					System.out.println("大盛り鍋奴を作って勝負します");
					nextGauge = 5;
					
					canCreate = true;
					break;
				}
			}

			//作らない

			if(dishNumber == 100) {
				System.out.println("料理を作らず勝負します");
				nextGauge = 1;
				canCreate = true;
				break;
			}

		}	
	}
}
