package v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNextHand implements NextHand {

	@Override
	public int decideHand() {
		int hand = -1;
		do {
			System.out.println("手を選択してください");
			System.out.println("0:グー 1:チョキ 2:パー");
			System.out.print(" > ");
			try {
			    hand = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("数字を入力してください。");
				hand = -1;
			}
		} while (hand < 0 || hand > 2);
		return hand;
	}

}
