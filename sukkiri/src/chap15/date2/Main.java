package chap15.date2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println("1:" + l1);
		LocalDate d1 = LocalDate.now();
		System.out.println("2:" + d1);
		LocalDateTime l2 = LocalDateTime.of(2025,6,4,14,00);
		System.out.println("3:" + l2);
		// l1 から l2 までどれくらい期間があるか？
		// 比較する場合、時分秒まで含めて計算している。
		System.out.println("4:" + ChronoUnit.DAYS.between(l1, l2));
		System.out.println("5:" + ChronoUnit.YEARS.between(l1, l2));

		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		System.out.println("6:" + z1);
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println("7:" + l3);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println("8:" + l1.format(fmt));
		System.out.println("9:" + l2.format(fmt));
		
		JapaneseDate jd = JapaneseDate.now();
		System.out.println("10:" + jd);
	}

}
