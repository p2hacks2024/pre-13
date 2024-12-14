
package P2;

public class GameResult extends DecideDishes{

	static int hungryDamage = 0;
	static int cpuHungryDamage = 0;
	static boolean a;


	public static void attackDamage(boolean a) {
		hungryDamage=0;
		cpuHungryDamage=0;
		if(a == false) { //自分か相手の手番を判断して、変えるゲージを決める
			CPUNextGauge = nextGauge;
			cpuHungryDamage = roleNumber*CPUNextGauge;
			for(int i = CPUCurrentGauge; i < cpuHungryDamage+CPUCurrentGauge; i++) {
				if(i > 49) {
					break;
				}
				CPUHungryGauge[i] = "■";
			}
		}else {
			myNextGauge = nextGauge; 
			hungryDamage = CpuDecideRole.getCpuRoleNumber()*myNextGauge;
			for(int i = myCurrentGauge; i < hungryDamage+myCurrentGauge; i++) {
				if(i > 49) {
					break;
				}
				myHungryGauge[i] = "■";
			}
		}

		if(myNextGauge > 50) {
			myNextGauge = 50;
		}
		if(CPUNextGauge > 50) {
			CPUNextGauge = 50;
		}


		myCurrentGauge += hungryDamage;
		CPUCurrentGauge += cpuHungryDamage;
		
		System.out.print("自分の満腹ゲージ：");
		for(int i = 0; i < 50; i++) {
			System.out.print(myHungryGauge[i]);
		}
		System.out.print("\n");


		//CPUCurrentGauge = CPUNextGauge;
		System.out.print("CPUの満腹ゲージ：");
		for(int i = 0; i < 50; i++) {
			System.out.print(CPUHungryGauge[i]);
		}
		System.out.print("\n");

		System.out.println();
	}


	public static int finalResult() {

		if(CPUHungryGauge[49] == "■") {
			System.out.println("お残し！あんたの勝ち！");
			return 0;
		}
		if(myHungryGauge[49] == "■") {
			System.out.println("お残し！あんたの負け！");
			return 0;
		}
		return 1;

	}

}
