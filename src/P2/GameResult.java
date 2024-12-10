package P2;

public class GameResult extends SelectFlavor{
	
	static int hungryDamage = 0;
	
	public static void attackDamage() {
		
		hungryDamage = roleNumber*nextGauge;
		
		if(nextGauge > 50) {
			nextGauge = 50;
		}
		for(int i = currentGauge; i < nextGauge; i++) {
			hungryGauge[i] = "■";
		}
		currentGauge = nextGauge;
		System.out.print("相手の満腹ゲージ：");
		for(int i = 0; i < 50; i++) {
			System.out.print(hungryGauge[i]);
		}
		System.out.print("\n");
	}
	
	public static void finalResult() {
		
		if(hungryGauge[49] == "■") {
			System.out.print("お残し！あんたの勝ち！");
		}
		
	}
	
}
