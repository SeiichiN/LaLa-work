package chap16.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		User u1 = new User("染谷将太", 29);
		userList.add(u1);
		User u2 = new User("二階堂ふみ", 27);
		userList.add(u2);
		User u3 = new User("窪塚洋介", 42);
		userList.add(u3);
		
		for (User user : userList) {
			System.out.println
			  (user.getName() + ":" + user.getAge());
		}
	}

}
