package chap15;

public class Main568 {

	public static void main(String[] args) {
		String name = "WAAAAAAA";
		if (isValidPlayerName(name)) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}

	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
