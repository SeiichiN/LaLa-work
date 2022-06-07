package v3;

import java.util.Scanner;

public class Game {
	private String msg = null;
	private String[] hands = {"グー", "チョキ", "パー"};
	
	public void judge(Com com, User user) {
		int comHand = com.getHand();
		int userHand = user.getHand();
		
		if (userHand == comHand) {
			com.setResult("draw");
			user.setResult("draw");
			msg = "引き分けです。";
		} else if ((userHand + 1) % 3 == comHand) {
			com.setResult("lose");
			user.setResult("win");
			msg = user.getName() + "の勝ちです。";
		} else {
			com.setResult("win");
			user.setResult("lose");
			msg = com.getName() + "の勝ちです。";
		}
	}
	
	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果");
		System.out.println
		  (com.getName() + ":" + this.hands[com.getHand()]);
		System.out.println
		  (user.getName() + ":" + this.hands[user.getHand()]);
		System.out.println(msg);
	}
	
	public boolean isNext() {
		System.out.print("もう一度やりますか？ (y/n) > ");
		String yesno = 
				new Scanner(System.in).nextLine().toLowerCase();
		if (yesno.equals("y")) {
			return true;
		}
		return false;
	}
}
