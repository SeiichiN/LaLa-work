package world;

public class SuperHero extends Hero {
	boolean flying;
	
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	public void run() {
		System.out.println(this.getName() + "は撤退した");
	}
	
	public void attack(Monster m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
	
}