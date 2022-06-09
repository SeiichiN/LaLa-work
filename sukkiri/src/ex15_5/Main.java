package ex15_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate future = now.plusDays(100);
		System.out.println(future);
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("西暦 yyyy年MM月dd日");
		System.out.println(future.format(dtf));
	}

}
