package chap15.date2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main591 {

	public static void main(String[] args) {
		Instant i1 = Instant.now();
		System.out.println("1:" + i1);
		
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		System.out.println("2:" + i2);
		long l = i2.toEpochMilli();
		System.out.println("3:" + l);
		
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println("4:" + z1);
		ZonedDateTime z2 = ZonedDateTime.of(2022, 6, 6, 0, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
		System.out.println("5:" + z2);
		

	}

}
