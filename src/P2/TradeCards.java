/**
 * 
 */
package P2;

import java.util.Scanner;

public class TradeCards extends Tohu{

	static boolean moreCard = false;

	public static void TradeCards(){
		//カードを指定して交換ボタンを押す(今回は仮で入力する)
		if(moreCard == false) {
			System.out.println("1~5で変えたいカードの番号をどうぞ");
			Scanner scan = new Scanner(System.in);

			int tradeNumber = scan.nextInt();
			System.out.println(tradeNumber + "番目ですね？");
			System.out.println("交換します");

			myCards[tradeNumber-1] = cards[r.nextInt(3)];
			//ここで満腹度を増やす

			for (int i = 0; i < myCards.length; i++) {
				System.out.println(myCards[i]);
			}
			for (int i = 0; i < myFlavors.length; i++) {
				System.out.println(myFlavors[i]);
			}
			
			//この時点で満腹度が上限-1なら交換できないようにする
			
			System.out.println("まだ交換しますか？");
			String more = scan.next();
			
			if(!more.equals("no")) {
				TradeCards();
			}else {
				moreCard = true;
			}
			
		}
	}
}