package chap17.nuk;

import java.util.Scanner;

public class Ren02 {

	public static void main(String[] args) {
		int num = inputNum();
		System.out.println("入力されたのは " + num + " です。");
	}

	public static int inputNum() {
		System.out.print("数字を入力してください > ");
		String numTxt = new Scanner(System.in).nextLine();
		int num = Integer.parseInt(numTxt);
		return num;
	}
}
