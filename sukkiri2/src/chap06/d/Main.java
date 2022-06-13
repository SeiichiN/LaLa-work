package chap06.d;

import java.util.function.IntToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		double b = 1.4;
		IntToDoubleFunction func = x -> x * x * b;

	}

}
