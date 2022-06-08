package ex14.effective;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		User u1 = new User("Sasuke");
		userList.add(u1);
		u1 = new User("Sasuke");
		userList.remove(u1);
		
		for (User u : userList) {
			System.out.println(u.name);
		}
		
		System.out.println(userList.size());
		// System.out.println(u1.equals(u2));
	}

}
