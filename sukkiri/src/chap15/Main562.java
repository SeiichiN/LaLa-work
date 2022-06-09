package chap15;

public class Main562 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
			if (i % 20 == 0) {
				sb.append("\n");
			}
		}
		String s = sb.toString();
		System.out.println(s);
	}

}
