package old;

public class HeroOld {
	public String name;
	public int hp;
	// public Sword sword;
	
	public HeroOld() {
		this("ダミー");
	}
	public HeroOld(String name) {
		this.name = name;
		this.hp = 100;
	}
	
//	public void attack() {
//		System.out.println
//		  (this.name + "は" + this.sword.name + "で攻撃した");
//		System.out.println("敵に5ポイントのダメージを与えた。");
//		
//	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
		this.hp = this.hp + sec;
		System.out.println
		  (this.name + "は、" + sec + "秒座った");
		System.out.println
		  ("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp = this.hp - 5;
		System.out.println(this.name + "は、ころんだ");
		System.out.println("5のダメージ");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
