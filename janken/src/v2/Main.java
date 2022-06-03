package v2;

public class Main {

	public static void main(String[] args) {
		// 戦略クラスを選ぶ
		Player com1 = new Player(new CleverNextHand());
		System.out.println("comの次の手は " + com1.getHand() + "です。");

		Player com2 = new Player(new RandomNextHand());
		System.out.println("comの次の手は " + com2.getHand() + "です。");
	}

}
