package v3;

import java.util.Scanner;

public class Game {
	private String msg = null;
	private String[] hands = {"グー", "チョキ", "パー"};
	
	public void judge(Com com1, Com com2, User user) {
		int c1 = com1.getHand();
		int c2 = com2.getHand();
		int u = user.getHand();
		
		if (c1 == c2 && c2 == u) {
			com1.setResult("draw");
			com2.setResult("draw");
			user.setResult("draw");
			msg = "引き分けです。";
		}
		else if (c1 != c2 && c2 != u && c1 != u) {
			com1.setResult("draw");
			com2.setResult("draw");
			user.setResult("draw");
			msg = "引き分けです。";
		}
		else if (((c1 + 1) % 3 == c2) && (c2 == u)) {
			com1.setResult("win");
			com2.setResult("lose");
			user.setResult("lose");
			msg = com1.getName() + "の勝ちです。";
		}
		else if (((c2 + 1) % 3 == c1) && (c1 == u)) {
			com1.setResult("lose");
			com2.setResult("win");
			user.setResult("lose");
			msg = com2.getName() + "の勝ちです。";
		}
		else if (((u + 1) % 3 == c1) && (c1 == c2)) {
			com1.setResult("lose");
			com2.setResult("lose");
			user.setResult("win");
			msg = user.getName() + "の勝ちです。";
		}
		else if (((c1 + 1) % 3 == c2) && (c1 == u)) {
			com1.setResult("win");
			com2.setResult("lose");
			user.setResult("win");
			msg = com1.getName() + "と" + user.getName() + "の勝ちです。";
		}
		else if (((c1 + 1) % 3 == u) && (c1 == c2)) {
			com1.setResult("win");
			com2.setResult("win");
			user.setResult("lose");
			msg = com1.getName() + "と" + com2.getName() + "の勝ちです。";
		}
		else if (((c2 + 1) % 3 == c1) && (c2 == u)) {
			com1.setResult("lose");
			com2.setResult("win");
			user.setResult("win");
			msg = com2.getName() + "と" + user.getName() + "の勝ちです。";
		}
		else {
			System.out.println("com1:" + c1 + " com2:" + c2 + " user:" + u);
		}
	}
	
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

	public void dispResult(Com com1, Com com2, User user) {
		System.out.println("ゲーム結果");
		System.out.print(com1.getName() + ":" + this.hands[com1.getHand()]);
		System.out.print(" " + com2.getName() + ":" + this.hands[com2.getHand()]);
		System.out.println(" " + user.getName() + ":" + this.hands[user.getHand()]);
		System.out.println(msg);
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
