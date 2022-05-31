package main;

import world.Dog;
import world.Hawk;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "犬";
		dog.eat();
		for (int i = 0; i < 10; i++) {
			dog.go();
		}

		Hawk hawk = new Hawk();
		hawk.name = "タカ";
		hawk.go();
		hawk.eat();
	}

}
