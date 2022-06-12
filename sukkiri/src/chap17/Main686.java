package chap17;

public class Main686 {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setAge(-30);
		} catch(IllegalArgumentException e) {
			System.out.println("error");
		}

	}

}
