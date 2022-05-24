package ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex4_4_ex {

	public static void main(String[] args) {
		// (1)
		int[] numbers = new int[2];
		numbers[0] = new java.util.Random().nextInt(9) + 1;
		do {
			numbers[1] = new java.util.Random().nextInt(9) + 1;
		} while (numbers[0] == numbers[1]);
		
		// (2)
		System.out.println("1けたの数字を入力してください");
		
		// (3)
		int input = 0;
		Scanner in = null;
		try {
			in = new java.util.Scanner(new File("ex4.txt"));
			input = in.nextInt();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		// (4)
		for (int num : numbers) {
			if (input == num) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("ハズレ");
			}
		}

	}

}
