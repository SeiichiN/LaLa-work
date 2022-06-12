package chap17.nuk;

import java.util.Scanner;

public class Ren01 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください > ");
		String numTxt = new Scanner(System.in).nextLine();
		int num = Integer.parseInt(numTxt);
		System.out.println("入力されたのは " + num + " です。");

	}

}
