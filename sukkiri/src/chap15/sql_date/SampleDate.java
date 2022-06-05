package chap15.sql_date;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;


/**
 * java.util.Date と java.sql.Date の違い
 * https://dev.classmethod.jp/articles/java-util-sql-date-difference/
 * 
 * @author se-ichi
 *
 */
public class SampleDate {
	private static final String DBURL = "jdbc:mysql://localhost:3306/date_sample";
	private static final String DBUSER = "seiichi";
	private static final String DBPASS = "seiichi";
	private static final String SQL_INSERT =
			"INSERT INTO sample (day) VALUES (?)";

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Date sqlDate = new Date(Calendar.getInstance().getTimeInMillis());
			Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis() - 1000*60*60*24);

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			PreparedStatement pStmt = conn.prepareStatement(SQL_INSERT);
			
			pStmt.setDate(1,  sqlDate);
			pStmt.executeUpdate();
			
			pStmt.setTimestamp(1, timestamp);
			pStmt.executeUpdate();
			
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
