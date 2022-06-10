package chap15.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main596 {

	public static void main(String[] args) {
		DateTimeFormatter fmt =
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate =
				LocalDate.parse("2020/09/22", fmt);
		System.out.println(ldate);
		
		LocalDate ldatep = ldate.plusDays(1000);
		System.out.println(ldatep);
		
		String str = ldatep.format(fmt);
		System.out.println(str);
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		if (now.isBefore(ldatep)) {
			System.out.println("1000日後は未来日付です");
		}
		

	}

}
