package ex15_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Date n = new Date();
		Calendar c = Calendar.getInstance();
		// c.setTime(n);
		Date d = c.getTime();
		System.out.println(d);
		int now = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, now + 100);
		Date d2 = c.getTime();
		System.out.println(d2);
		SimpleDateFormat sdf = new SimpleDateFormat("西暦 yyyy年MM月dd日");
		System.out.println(sdf.format(d2));
	}

}
