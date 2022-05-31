package world;

public class Dog extends Animal {
	
	public void roar() {
		System.out.println(this.name + "は吠えた。");
		System.out.println("hpが1減った。");
		this.hp = this.hp - 1;
	}

}
