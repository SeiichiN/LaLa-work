package world;

public class PoisonMatango extends Matango{
	public int pcount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		System.out.println("PoisonMatangoの攻撃");
		super.attack(h);
//		if (this.pcount != 0) {
//			System.out.println(this.suffix + "は、さらに毒の胞子をばらまいた。");
//			int damage = h.hp / 5;
//			h.hp = h.hp - damage;
//			System.out.println
//			  (h.name + "に" + damage + "ポイントのダメージ！");
//			System.out.println(h.name + "のHP:" + h.hp);
//			this.pcount--;
//			System.out.println("毒攻撃残り回数:" + this.pcount);
//		}
	}
	
}
