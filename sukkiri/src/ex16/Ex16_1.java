package ex16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex16_1 {
	public static void main(String[] args) {
		Set<String> prefs = new HashSet<>();
		prefs.add("大阪府");
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "ミナト", 50));
	
		Map<String, Integer> list = new HashMap<>();
		list.put("吉田茂", 6);
	}
}

class Student {
	int no;
	String name;
	int seiseki;
	public Student(int no, String name, int seiseki) {
		this.no = no;
		this.name = name;
		this.seiseki = seiseki;
	}
}
