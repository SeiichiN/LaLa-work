package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main660 {

	public static void main(String[] args) {
		String txt = "Hello, World!";
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			// FileWriter fw = null;
			fw.write(txt);
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("ファイルの書き込みに失敗しました。");
		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println("nullだよ");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
