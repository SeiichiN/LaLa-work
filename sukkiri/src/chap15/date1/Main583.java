package chap15.date1;

import java.util.Calendar;
import java.util.Date;

public class Main583 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.getTime());
		Date d = c.getTime();
		System.out.println(d);

		c.set(2019, 8, 22);
		System.out.println(c.getTime());
		c.set(Calendar.MONTH, 9);
		System.out.println(c.getTime());
	}

}
