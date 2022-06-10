package chap16;

import java.util.HashSet;
import java.util.Set;

public class Main629 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黃");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");
		
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
