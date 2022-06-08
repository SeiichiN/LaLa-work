package ex14.effective;

public class User {
	public String name;
	
	public User (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}
		User u = (User) o;
		if (this.name.equals(u.name)) {
			return true;
		}
		return false;
	}
	
	public boolean _equals(User u) {
		if (u instanceof User) {
			if (this.name.equals(u.name)) {
				return true;
			}
		}
		return false;
	}

	@Override 
	public int hashCode() {
		int result = 37;
		result = result * 31 + name.hashCode();
		return result;
	}
}
