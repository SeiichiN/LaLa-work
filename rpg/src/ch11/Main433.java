package ch11;

import world.Hero;
import world.SuperHero;

public class Main433 {

	public static void main(String[] args) {
		/*
		Goblin goblin = new Goblin();
		goblin.attack();
		goblin.run();
		System.out.println("hp:" + goblin.hp);
		System.out.println("mp:" + goblin.mp);
		
		Werewolf w = new Werewolf();
		w.attack();
		w.run();
		System.out.println("hp:" + w.hp);
		System.out.println("mp:" + w.mp);

		DeathBat d = new DeathBat();
		d.attack();
		d.run();
		System.out.println("hp:" + d.hp);
		System.out.println("mp:" + d.mp);
		*/
		
		Hero h = new Hero("田中");
		h.sleep();
		
		SuperHero sh = new SuperHero("まえだ");
		sh.sleep();
	}

}
