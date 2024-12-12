
package P2;

public class CpuDecideCards extends CPU{

	static int[] cpuAllCards = new int[5];
	static int[] cpuAllFlavors = new int[100];
	static long cpuTohuX = 1;
	static long cpuFlavorX = 1;

	public static void cpuConvertNumber() {
		//食材に素数を与える、積で役や料理を特定(最初に考えた人ありがとう)

		for(int i=0 ; i<5 ; i++) {
			if(CpuCards[i] == "木綿豆腐") {
				cpuAllCards[i] = 2;
			}
			if(CpuCards[i] == "卵豆腐") {
				cpuAllCards[i] = 3;
			}
			if(CpuCards[i] == "絹ごし豆腐") {
				cpuAllCards[i] = 5;
			}
			if(CpuCards[i] == "ゲーミング豆腐") {
				cpuAllCards[i] = 7;
			}
		}

		for(int i=0 ; i < cpuNumberOfCards ; i++) {
			if(cpuFlavors[i] == "醤油") {
				cpuAllFlavors[i] = 11;
			}
			if(cpuFlavors[i] == "味噌") {
				cpuAllFlavors[i] = 13;
			}
			if(cpuFlavors[i] == "辛味調味料") {
				cpuAllFlavors[i] = 17;
			}
			if(cpuFlavors[i] == "出汁") {
				cpuAllFlavors[i] = 19;
			}
			if(cpuFlavors[i] == "肉") {
				cpuAllFlavors[i] = 23;
			}
			if(cpuFlavors[i] == "ネギ") {
				cpuAllFlavors[i] = 29;
			}
			if(cpuFlavors[i] == "葉物野菜") {
				cpuAllFlavors[i] = 31;
			}
			if(cpuFlavors[i] == "根菜") {
				cpuAllFlavors[i] = 37;
			}
		}

	}

	public static long cpuCalculateTohu() {
		cpuTohuX = 1;
		for(int i=0 ; i<5 ; i++) {
			cpuTohuX = cpuAllCards[i]*cpuTohuX;
		}
		return cpuTohuX;
	}

	public static long cpuCalculateFlavor() {
		cpuFlavorX = 1;
		for(int i=0 ;cpuFlavors[i]!=null ; i++) {
			cpuFlavorX = cpuAllFlavors[i]*cpuFlavorX;
		}
		return cpuFlavorX;
	}

}