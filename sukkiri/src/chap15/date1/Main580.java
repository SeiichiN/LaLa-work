package chap15.date1;

import java.util.Date;

public class Main580 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		
		now.setYear(21);
		System.out.println(now);

	}

}
