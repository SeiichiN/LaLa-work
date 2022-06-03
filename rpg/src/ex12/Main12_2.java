package ex12;

public class Main12_2 {

	public static void main(String[] args) {
		System.out.println("(1)");
		X obj = new A();
		obj.a();
		System.out.println("\n---------------");
		
		System.out.println("(2)");
		Y y1 = new A();
		Y y2 = new B();
		y1.a();
		y2.a();
		

	}

}
