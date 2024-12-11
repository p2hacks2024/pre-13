package P2;

public class CpuDecideRole extends CpuDecideCards{

	static String cpuroleString;
	static int cpuroleNumber = 0;

	public static void cpuDecideRoleNumber() {

		if(cpuTohuX == 32|| cpuTohuX == 243 || cpuTohuX == 3125 || cpuTohuX == 16807) {
			cpuroleString = "Frash"; //豆腐ラッシュ
			cpuroleNumber = 7;
		}
		else if(cpuTohuX == 48|| cpuTohuX == 80 || cpuTohuX == 112 //スペード
				|| cpuTohuX == 162 || cpuTohuX == 405|| cpuTohuX == 567 //ダイヤ
				|| cpuTohuX == 1250|| cpuTohuX == 1875 || cpuTohuX == 4375 //ハート
				|| cpuTohuX == 4802|| cpuTohuX == 7203 || cpuTohuX == 12005){//クラブ
			cpuroleString = "FourCard"; //フォーカード
			cpuroleNumber = 4;
		}
		else if(cpuTohuX == 72|| cpuTohuX == 200 || cpuTohuX == 392 //スペード3
				|| cpuTohuX == 108 || cpuTohuX == 675|| cpuTohuX == 1323 //ダイヤ3
				|| cpuTohuX == 500|| cpuTohuX == 1125 || cpuTohuX == 6125 //ハート3
				|| cpuTohuX == 1372|| cpuTohuX == 3087 || cpuTohuX == 8575){//クラブ3
			cpuroleString = "FourCard"; //フルハウス
			cpuroleNumber = 3;
		}
		else if(cpuTohuX % 8 == 0|| cpuTohuX % 27 == 0 || cpuTohuX % 125 == 0 || cpuTohuX % 343 == 0) {
			cpuroleString = "ThreeCard"; //スリーカード
			cpuroleNumber = 2;
		}
		else if(cpuTohuX % 36 == 0|| cpuTohuX % 100 == 0 || cpuTohuX % 196 == 0 //スペード+なにかしらのペア
				|| cpuTohuX % 36 == 0|| cpuTohuX % 225 == 0 || cpuTohuX % 441 == 0 //ダイヤ+なにかしらのペア
				|| cpuTohuX % 100 == 0|| cpuTohuX % 225 == 0 || cpuTohuX % 1225 == 0 //ハート+なにかしらのペア
				|| cpuTohuX % 196 == 0|| cpuTohuX % 441 == 0 || cpuTohuX % 1225 == 0){//クラブ+なにかしらのペア
			cpuroleString = "TwoPare"; //ツーペア if文に被りあるのは分かりやすくするため
			cpuroleNumber = 2;
		}
		else {
			cpuroleString = "OnePare"; //ワンペア
			cpuroleNumber = 1;
		}
	}
	
	public static int getCpuRoleNumber() {
		return cpuroleNumber;
	}
}
