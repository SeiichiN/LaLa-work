package world;

public class Hero extends Character {
	// public String name;
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	public Hero(String name) {
		super(name);
		// this.name = name;
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		m.hp = m.hp - 5;
		System.out.println("敵に5ポイントのダメージを与えた。");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した");
	}
}
