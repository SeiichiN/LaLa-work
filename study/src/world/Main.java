package world;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("犬");
		dog.eat();
		dog.go();

		Hawk hawk = new Hawk();
		hawk.setName("タカ");
		hawk.go();
		hawk.eat();
	}

}
