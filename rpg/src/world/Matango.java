package world;

public class Matango {
	public int hp = 50;
	public char suffix;
	
	public Matango() {
		this.suffix = 'A';
	}
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("Matangoの攻撃");
		System.out.println
		  ("キノコ" + this.suffix + "の攻撃");
		System.out.println(h.name + "に10のダメージを与えた。");
		h.hp = h.hp - 10;
		System.out.println(h.name + "のHP:" + h.hp);
	}
}
