package ch11;

import world.Dancer;
import world.Hero;
import world.Matango;

public class Main {

	public static void main(String[] args) {
		Matango m = new Matango('A');
		Dancer dancer = new Dancer();
		dancer.attack(m);
		dancer.run();
		dancer.sleep();
		
		Hero hero = new Hero("マシリト");
		hero.attack(m);
		hero.run();
		
	}

}
