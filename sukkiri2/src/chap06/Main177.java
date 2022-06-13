package chap06;

import java.util.function.IntBinaryOperator;

public class Main177 {

	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		IntBinaryOperator func = Main177::sub;
		int a = func.applyAsInt(5, 3);
		System.out.println("5 - 3 = " + a);
	}

}
