package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main681 {
	public static void main(String[] args) throws IOException {
		sub();
	}
	
	public static void sub() throws IOException {
		subsub();
	}
	
	public static void subsub() throws IOException {
		String txt = "Hello, World!";
		FileWriter fw = null;
		fw = new FileWriter("data.txt");
		fw.write(txt);
		fw.close();
	}
}
