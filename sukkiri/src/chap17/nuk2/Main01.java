package chap17.nuk2;

public class Main01 {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int x = 10;
		int y = 3;
		int ans = calc.divide(x, y);
		System.out.printf("%d / %d = %d ... %d\n", x, y, ans);
	}

}
