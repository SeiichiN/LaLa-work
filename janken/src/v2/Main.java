package v2;

public class Main {

	public static void main(String[] args) {
		// 戦略クラスを選ぶ
		Com com1 = new Com(new RandomNextHand());
		com1.setName("コム1");

		User user = new User(new InputNextHand());
		user.setName("チョロ助");
		
		com1.setHand();
		user.setHand();
		
		Game game = new Game();
		game.judge(com1, user);
		game.dispResult(com1, user);
	}

}
