package P2;

public class Hungry {

	static boolean initHungry = false;
	static String[] hungryGauge;
	static int currentGauge;
	static int nextGauge;

	public static void increaseHungry() {
		
		if(initHungry == false) {
			hungryGauge = new String[50];
			currentGauge = 0;
			for(int i = 0; i < 50; i++) {
				hungryGauge[i] = "□";
			}
			initHungry = true;
		}
		
		System.out.print("相手の満腹ゲージ：");
		for(int i = 0; i < 50; i++) {
			System.out.print(hungryGauge[i]);
		}
		System.out.print("\n");
		
	}

}
