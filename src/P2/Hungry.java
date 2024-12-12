package P2;

public class Hungry {

	static boolean initHungry = false;
	static String[] myHungryGauge;
	static String[] CPUHungryGauge;
	static int nextGauge;
	static int myCurrentGauge;
	static int myNextGauge;
	static int CPUCurrentGauge;
	static int CPUNextGauge;

	public static void increaseHungry() {
		if(initHungry == false) {
			myHungryGauge = new String[50];
			CPUHungryGauge = new String[50];
			//myCurrentGauge = 0;
			//CPUCurrentGauge = 0;
			for(int i = 0; i < 50; i++) {
				myHungryGauge[i] = "□";
				CPUHungryGauge[i] = "□";
			}
			initHungry = true;
		}

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

	}
	public static void endHungry() {
		myCurrentGauge=0;
		CPUCurrentGauge=0;
		initHungry = false;
	}

}
