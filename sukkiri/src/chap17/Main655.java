package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main655 {

	public static void main(String[] args) {
		String txt = null;
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write(txt);
		} catch (IOException | NullPointerException e) {
			System.out.println("書き込み失敗: " + e.getMessage());
		}
		
	}

}
