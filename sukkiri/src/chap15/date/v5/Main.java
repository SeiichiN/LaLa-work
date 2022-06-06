package chap15.date.v5;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		Keep keep = new Keep(date);
		date.setYear(78);
		System.out.println("date:" + date);
		System.out.println("keep.date:" + keep.getDate());
	}

}
