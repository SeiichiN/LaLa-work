package chap15;

import java.util.Calendar;
import java.util.Date;

public class Main583 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2019, 8, 22);
		System.out.println(c);
		// c.set(Calendar.MONTH, 9);
		Date d = c.getTime();    // Date型に変換
		System.out.println(d);
		
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.MONTH);
		System.out.println(y);
	}

}
