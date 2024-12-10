package P2;

public class GameResult extends DecideDishes{
	
	static int hungryDamage = 0;
	static boolean a;
	
	public static void attackDamage(boolean a) {
		
		
		
		if(a == false) { //自分か相手の手番を判断して、変えるゲージを決める
			CPUNextGauge = nextGauge;
			hungryDamage = roleNumber*CPUNextGauge;
		}else {
			myNextGauge = nextGauge; 
			hungryDamage = roleNumber*myNextGauge;
		}
		
		if(myNextGauge > 50) {
			myNextGauge = 50;
		}
		if(CPUNextGauge > 50) {
			CPUNextGauge = 50;
		}
		
		for(int i = myCurrentGauge; i < myNextGauge; i++) {
			myHungryGauge[i] = "■";
		}
		myCurrentGauge = myNextGauge;
		System.out.print("自分の満腹ゲージ：");
		for(int i = 0; i < 50; i++) {
			System.out.print(myHungryGauge[i]);
		}
		System.out.print("\n");
		
		for(int i = CPUCurrentGauge; i < CPUNextGauge; i++) {
			CPUHungryGauge[i] = "■";
		}
		CPUCurrentGauge = CPUNextGauge;
		System.out.print("CPUの満腹ゲージ：");
		for(int i = 0; i < 50; i++) {
			System.out.print(CPUHungryGauge[i]);
		}
		System.out.print("\n");
	}
	
	public static int finalResult() {
		
		if(CPUHungryGauge[49] == "■") {
			System.out.print("お残し！あんたの勝ち！");
			return 0;
		}
		if(myHungryGauge[49] == "■") {
			System.out.print("お残し！あんたの負け！");
			return 0;
		}
		return 1;
		
	}
	
}
