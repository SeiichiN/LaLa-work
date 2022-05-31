package world;

public class PoisonMatango extends Matango{
	public int pcount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (pcount != 0) {
			System.out.println("さらに毒の胞子をばらまいた。");
			int damage = h.hp / 5;
			h.hp = h.hp - damage;
			System.out.println
			  (h.name + "に" + damage + "ポイントのダメージ！");
			System.out.println(h.name + "のHP:" + h.hp);
			pcount--;
			System.out.println("毒攻撃残り回数:" + pcount);
		}
	}
}
