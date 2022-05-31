package ex10;

import world.PoisonMatango;
import world.SuperHero;

public class Main {

	public static void main(String[] args) {
		
		PoisonMatango pm = new PoisonMatango('Z');

		// Hero h = new Hero();
		// pm.attack(h);
		
		SuperHero sh = new SuperHero("アサカ");
		pm.attack(sh);
		
		// h.attack(pm);
		// sh.attack(pm);
	}

}
