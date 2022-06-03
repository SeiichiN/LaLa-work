package ex12;

public class Main12_3 {

	public static void main(String[] args) {
		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		for (Y p : array) {
			p.b();
		}

	}

}
