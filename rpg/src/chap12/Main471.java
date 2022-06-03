package chap12;

import world.Character;
import world.Matango;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {
		
		Character c = new Wizard();
		if (c instanceof Wizard) {
			System.out.println("いいよ！");
		}
		Wizard w = (Wizard) c;
		Matango m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);

//		if (c instanceof Hero) {
//			 Hero h = (Hero) c;
//			 h.attack(m);
//		} else {
//			System.out.println("cのインスタンスはHeroではない");
//		}
		
	}

}
