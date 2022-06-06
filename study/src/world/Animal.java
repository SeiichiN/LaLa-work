package world;

public class Animal {
	private String name;
	private int hp = 10;
	private boolean life = true;
	
	public Animal() {
		this.name = "アニマル";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name + "は食べた。");
		System.out.println("hpが10あがった。");
		this.hp = this.hp + 10;
	}
	
	public void go() {
		System.out.println(this.name + "は走った。");
		System.out.println("hpを5使った.");
		this.hp = this.hp - 5;
		if (this.hp < 1) {
			dead();
		}
	}
	
	public void dead() {
		life = false;
		System.out.println(this.name + "は死んだ。");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean isLife() {
		return life;
	}

	public void setLife(boolean life) {
		this.life = life;
	}
}

