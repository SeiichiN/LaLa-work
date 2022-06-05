package chap15.date1;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main01 {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(1972, Calendar.OCTOBER, 26);
		System.out.println(cal.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.getTime() + ":" + cal2.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("-------------------");
		oneWeek(System.out, cal2);
		
		System.out.println(dotw(2022, 5, 5));
	}
	
	/**
	 * 1週間を出力する
	 * @param out (System.out)を与えればよい。 
	 * @param cal 
	 */
	public static void oneWeek(PrintStream out, Calendar cal) {
		Calendar cur = (Calendar) cal.clone();
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		do {
			out.println(cur.getTime() + ":" + cur.get(Calendar.DAY_OF_WEEK));
			cur.add(Calendar.DAY_OF_WEEK, 1);
		} while (cur.get(Calendar.DAY_OF_WEEK) != dow);
	}

	/**
	 * 指定された年月日が何曜日かを出力する
	 * @param year
	 * @param month
	 * @param date
	 * @return
	 */
	public static int dotw(int year, int month, int date) {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
}
