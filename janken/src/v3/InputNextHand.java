package v3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputNextHand implements NextHand {
	public int decideHand() {
        @SuppressWarnings("resource")
        int hand = -1;
        do {
            System.out.println("手を選択してください。");
            System.out.print("0:グー 1:ちょき 2:パー");
            System.out.print(" > ");
            try {
                hand = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("数字を入力してください。");
                hand = -1;
            }
        } while (hand < 0 || hand > 2);
		return hand;
	}

}
