package P2;

public class DecideRoles extends DecideCards{

	static String roleString;

	public static void decideRoleNumber() {

		if(TohuX == 32|| TohuX == 243 || TohuX == 3125 || TohuX == 16807) {
			roleString = "Frash"; //豆腐ラッシュ
		}
		else if(TohuX == 48|| TohuX == 80 || TohuX == 112 //スペード
				|| TohuX == 162 || TohuX == 405|| TohuX == 567 //ダイヤ
				|| TohuX == 1250|| TohuX == 1875 || TohuX == 4375 //ハート
				|| TohuX == 4802|| TohuX == 7203 || TohuX == 12005){//クラブ
			roleString = "FourCard"; //フォーカード
		}
		else if(TohuX == 72|| TohuX == 200 || TohuX == 392 //スペード3
				|| TohuX == 108 || TohuX == 675|| TohuX == 1323 //ダイヤ3
				|| TohuX == 500|| TohuX == 1125 || TohuX == 6125 //ハート3
				|| TohuX == 1372|| TohuX == 3087 || TohuX == 8575){//クラブ3
			roleString = "FourCard"; //フルハウス
		}
		else if(TohuX % 8 == 0|| TohuX % 27 == 0 || TohuX % 125 == 0 || TohuX % 343 == 0) {
			roleString = "ThreeCard"; //スリーカード
		}
		else if(TohuX % 36 == 0|| TohuX % 100 == 0 || TohuX % 196 == 0 //スペード+なにかしらのペア
				|| TohuX % 36 == 0|| TohuX % 225 == 0 || TohuX % 441 == 0 //ダイヤ+なにかしらのペア
				|| TohuX % 100 == 0|| TohuX % 225 == 0 || TohuX % 1225 == 0 //ハート+なにかしらのペア
				|| TohuX % 196 == 0|| TohuX % 441 == 0 || TohuX % 1225 == 0){//クラブ+なにかしらのペア
			roleString = "TwoPare"; //ツーペア if文に被りあるのは分かりやすくするため
		}
		else {
			roleString = "OnePare"; //ワンペア
		}
	}
}
