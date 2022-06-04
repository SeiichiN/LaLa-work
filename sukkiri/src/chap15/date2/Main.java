package chap15.date2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2025,6,4,14,00);
		System.out.println(l1);
		System.out.println(l2);
		// l1 から l2 までどれくらい期間があるか？
		// 比較する場合、時分秒まで含めて計算している。
		System.out.println(ChronoUnit.DAYS.between(l1, l2));
		System.out.println(ChronoUnit.YEARS.between(l1, l2));

		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(z1);
		System.out.println(l3);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(l1.format(fmt));
		System.out.println(l2.format(fmt));
		
		
	}

}
