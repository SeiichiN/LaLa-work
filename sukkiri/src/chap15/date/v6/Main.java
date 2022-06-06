package chap15.date.v6;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		Keep keep = new Keep(date);
		date = date.plusDays(1);
		System.out.println("date:" + date);
		System.out.println("keep.date:" + keep.getDate());
	}

}
