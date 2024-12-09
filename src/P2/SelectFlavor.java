package P2;

import java.util.Scanner;

public class SelectFlavor extends DecideRoles{ //使うFlavorを選んでDecideDishes呼び出し

	static boolean usingFlavor = false;
	static String[] selectedFlavors = new String[100];
	static int i = 0;

	public static void SelectUsingFlavor() {

		System.out.println("調理カードを使いますか？ yes/no");
		Scanner FlavorUse = new Scanner(System.in);
		String trade = FlavorUse.next();
		if(trade.equals("yes")) {
			usingFlavor = false;
		}else {
			usingFlavor = true;
		}

		//カードを指定して交換ボタンを押す(今回は仮で入力する)
		if(usingFlavor == false) {
			System.out.println("使いたいカードは何番目ですか？");
			Scanner scan = new Scanner(System.in);
			int selectNumber = scan.nextInt();
			System.out.println(selectNumber + "番目ですね");
			selectedFlavors[i] = myFlavors[selectNumber-1];
			i++;

			System.out.println("まだ使いますか？ yes/no");
			String more = scan.next();

			if(!more.equals("no")) {
				SelectUsingFlavor();
			}else {
				moreCard = true;
			}
		}


	}

}
