package ex10;

import world.Hero;
import world.PoisonMatango;
import world.SuperHero;

public class Main {

	public static void main(String[] args) {
		
		PoisonMatango pm = new PoisonMatango('Z');

		// Hero h = new Hero("ささき");
		// pm.attack(h);
		
		SuperHero sh = new SuperHero("アサカ");
		pm.attack(sh);
		
		// h.attack(pm);
		// sh.attack(pm);
	}

}
