package v2;

public class Game {
	
	public void judge(Com com, User user) {
		int userHand = user.getHand();
		int comHand = com.getHand();
		if (userHand == comHand) {
			// ひきわけ
			com.setResult("draw");
			user.setResult("draw");
		} else if ((userHand + 1) % 3 == comHand) {
			// userの勝ち
			com.setResult("lose");
			user.setResult("win");
		} else {
			// comの勝ち
			com.setResult("win");
			user.setResult("lose");
		}
	}
	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果");
		System.out.println(com);
		System.out.println(user);
	}
}
