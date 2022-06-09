package chap15;

public class Main559 {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			disp("s1は、Javaを含んでいます");
		}
		if (s1.startsWith("Java")) {
			disp("先頭にJavaがある");
		}
		disp("Javaが登場する位置は");
		disp(s1.indexOf("and"));
		disp("Javaが最後に登場する位置は");
		disp(s1.lastIndexOf("Java"));
	}

	public static void disp(Object s) {
		System.out.println(s);
	}
}
