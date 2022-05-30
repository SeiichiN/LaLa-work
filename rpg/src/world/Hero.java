package world;

public class Hero {
	public String name = "ミナト";
	public int hp = 100;
	
	public Hero() {}
	public Hero(String name) {
		this.name = name;
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
