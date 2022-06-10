package ex15;

public class Ex15_1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 101; i++ ) {
			sb.append(i + ",");
		}
		String s = sb.toString();
		System.out.println(s);
		String[] a = s.split(",");

	}

}
