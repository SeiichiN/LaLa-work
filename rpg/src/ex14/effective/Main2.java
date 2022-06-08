package ex14.effective;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Set<User> userSet = new HashSet<>();
		User u = new User("Sasuke");
		userSet.add(u);
		showList(userSet);
		u = new User("Sasuke");
		userSet.remove(u);
		showList(userSet);

	}

	public static void showList(Set<User> list) {
		for (User u : list) {
			System.out.println(u.name);
		}
		System.out.println("要素数:" + list.size());
	}
}

