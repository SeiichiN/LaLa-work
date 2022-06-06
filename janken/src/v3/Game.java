package v3;

import java.util.Scanner;

public class Game {
	private String msg;
	
	public void judge(Com com, User user) {
		int userHand = user.getHand();
		int comHand = com.getHand();
		if (userHand == comHand) {
			// ひきわけ
			com.setResult("draw");
			user.setResult("draw");
			msg = "引き分けです。";
		} else if ((userHand + 1) % 3 == comHand) {
			// userの勝ち
			com.setResult("lose");
			user.setResult("win");
			msg = "あなたの勝ちです。";
		} else {
			// comの勝ち
			com.setResult("win");
			user.setResult("lose");
			msg = "わたしの勝ちです。";
		}
	}
	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果");
		System.out.println(com);
		System.out.println(user);
		System.out.println(msg);
	}
	
	public boolean isRetry() {
		System.out.print("もう一度やりますか？ (y/n) > ");
		String yesno = new Scanner(System.in).nextLine().toLowerCase();
		if (yesno.equals("y")) {
			return true;
		}
		return false;
	}
}
