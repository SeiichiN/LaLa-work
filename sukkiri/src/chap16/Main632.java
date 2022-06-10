package chap16;

import java.util.Set;
import java.util.TreeSet;

public class Main632 {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String a : words) {
			System.out.print(a + " -> ");
		}

	}

}
