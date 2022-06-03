package chap09;

import world.Hero;

public class Main362 {

	public static void main(String[] args) {
		Hero h1 = new Hero("サスケ");
		Hero h2 = new Hero();
		
		System.out.println("h1:" + h1.getName());
		System.out.println("h2:" + h2.getName());
	}

}
