package chap17;

public class Person {
	int age;

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException
				("年齢が0以上ではありません。指定値=" + age);
		}
		this.age = age;
	}
	
}
