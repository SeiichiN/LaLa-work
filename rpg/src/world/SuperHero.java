package world;

public class SuperHero extends Hero {
	public boolean flying;
	
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	public SuperHero(String name) {
		super(name);
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった!");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}
	
	public void run() {
		System.out.println(this.getName() + "は撤退した。");
	}
}
