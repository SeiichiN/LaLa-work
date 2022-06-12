package chap17.nuk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyUtilAns {
	public int inputStr() throws MyApplicationException {
		System.out.print("数字を入力してください > ");
		String numTxt = new Scanner(System.in).nextLine();
		int num = 0;
		try {
			num = Integer.parseInt(numTxt);
		} catch (NumberFormatException e) {
			throw new MyApplicationException(e.getMessage());
		}
		return num;
	}
	
	public int inputNum() {
		System.out.print("数字を入力してください > ");
		int num = 0;
		num = new Scanner(System.in).nextInt();

		return num;
	}
}
