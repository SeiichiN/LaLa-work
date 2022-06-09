package v3;

public class Main {

	public static void main(String[] args) {
		System.out.println("NINZU:" + Const.NINZU);
		
		// コム1
		Com com1 = new Com(new CleverNextHand());
		com1.setName("コム１");
		
		// コム2
		Com com2 = new Com(new RandomNextHand());
		com2.setName("アリス");
		
		// ユーザー
		User user = new User(new InputNextHand());
		user.setName("サスケ");
		
		Game game = new Game();
		do {
			com1.setHand();
	       com2.setHand();
			user.setHand();
			game.judge(com1, com2, user);
			game.dispResult(com1, com2, user);
		} while (game.isNext());
		System.out.println("bye!");
	}

}
