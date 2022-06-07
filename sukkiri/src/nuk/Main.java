package nuk;

public class Main {

	public static void main(String[] args) {
		User user = new User("seiichi");
		Keep keep = new Keep(user);
		System.out.println(keep.user.name);
		user.name = "yukio";
		System.out.println(keep.user.name);

	}

}
