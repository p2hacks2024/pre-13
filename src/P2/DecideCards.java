package P2;

public class DecideCards extends TradeCards{

	static int[] myAllCards = new int[5];
	static int[] myAllFlavors = new int[100];
	static int TohuX = 1;
	static int FlavorX = 1;

	public static void convertNumber() {
		//食材に素数を与える、積で役や料理を特定

		for(int i=0 ; i<5 ; i++) {
			if(myCards[i] == "スペード") {
				myAllCards[i] = 2;
			}
			if(myCards[i] == "ダイヤ") {
				myAllCards[i] = 3;
			}
			if(myCards[i] == "ハート") {
				myAllCards[i] = 5;
			}
			if(myCards[i] == "クラブ") {
				myAllCards[i] = 7;
			}
		}

		for(int i=0 ; i < numberOfCards ; i++) {
			if(myFlavors[i] == "醤油") {
				myAllFlavors[i] = 11;
			}
			if(myFlavors[i] == "味噌") {
				myAllFlavors[i] = 13;
			}
			if(myFlavors[i] == "辛味調味料") {
				myAllFlavors[i] = 17;
			}
			if(myFlavors[i] == "出汁") {
				myAllFlavors[i] = 19;
			}
			if(myFlavors[i] == "肉") {
				myAllFlavors[i] = 23;
			}
			if(myFlavors[i] == "ネギ") {
				myAllFlavors[i] = 29;
			}
			if(myFlavors[i] == "葉物野菜") {
				myAllFlavors[i] = 31;
			}
			if(myFlavors[i] == "根菜") {
				myAllFlavors[i] = 37;
			}
		}

	}

	public static int calculateTohu() {

		for(int i=0 ; i<5 ; i++) {
			TohuX = myAllCards[i]*TohuX;
		}
		return TohuX;
	}

	public static int calculateFlavor() {

		for(int i=0 ;myFlavors[i]!=null ; i++) {
			FlavorX = myAllFlavors[i]*FlavorX;
		}
		return FlavorX;
	}

}
