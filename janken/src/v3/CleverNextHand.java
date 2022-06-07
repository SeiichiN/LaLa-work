package v3;

import java.util.Random;

public class CleverNextHand implements NextHand {
	private Player player;

	public CleverNextHand() { }
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	@Override
	public int decideHand() {
		int hand = -1;
		if (this.player == null) {
			return new Random().nextInt(3);
		}
		// result = "draw" --> (hand + 1) % 3 を出す
		if (this.player.getResult() != null &&
				this.player.getResult().equals("draw")) {
			hand = (this.player.getHand() + 1) % 3;
		} else {
			hand = new Random().nextInt(3);
		}
		return hand;
	}

}
