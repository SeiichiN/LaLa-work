package chap06.b;

public class Main180 {

	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		MyFunction func = Main180::sub;
		int a = func.call(5, 3);
		System.out.println("5 - 3 = " + a);
	}

}
