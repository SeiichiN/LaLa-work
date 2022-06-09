package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main585 {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat f =
				new SimpleDateFormat("yyyy/MM/dd");
		Date d = f.parse("2025/05/01");
		System.out.println(d);

		Date now = new Date();
		long milis = d.getTime() - now.getTime();
		long sec = milis / 1000L;
		System.out.println(sec);
		
		long oneday = 24 * 60 * 60 * 1000L;
		long day = milis / oneday;
		// String s = f.format(l);
		System.out.println(day);
	}

}
