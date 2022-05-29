package world;

import java.util.Random;

public class Creric {
	String name;
	int hp = 50;
	final int HP_MAX = 50;
	int mp = 10;
	final int MP_MAX = 10;
	
	public void selfAid() {
		this.hp = this.HP_MAX;
		this.mp -= 5;
	}
	
	public int play(int sec) {
		int plus = new Random().nextInt(3);
		int kaihuku = sec + plus;
		this.mp = this.mp + kaihuku;
		if (this.mp > this.MP_MAX) {
			this.mp = this.MP_MAX;
		}
		return kaihuku;
	}
}
