package P2;

import java.util.Scanner;

public class DecideDishes extends DecideRoles{

	static int dishNumber = 100;

	public static void selectDishes() { //料理ごとに数値を設定

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
	}	
}
