package chap17.nuk;

import java.util.Scanner;

public class MyUtil {
	public int inputNum() {
		System.out.print("数字を入力してください > ");
		String numTxt = new Scanner(System.in).nextLine();
		int num = Integer.parseInt(numTxt);
		return num;
	}
	
	public int input() {
		System.out.print("数字を入力してください > ");
		int num = new Scanner(System.in).nextInt();
		return num;
	}
}
