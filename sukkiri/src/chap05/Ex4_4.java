package chap05;

public class Ex4_4 {

	public static void main(String[] args) {
		int[] nums = new int[2];
		junbi(nums);
		int user = input();
		hantei(nums, user);
	}
	
	public static void junbi(int[] numbers) {
		// (1)
		numbers[0] = new java.util.Random().nextInt(9) + 1;
		do {
			numbers[1] = new java.util.Random().nextInt(9) + 1;
		} while (numbers[0] == numbers[1]);		
	}
	
	public static int input() {
		// (2)
		System.out.println("1けたの数字を入力してください");
		
		// (3)
		int input = new java.util.Scanner(System.in).nextInt();		
		return input;
	}

	public static void hantei(int[] numbers, int input) {
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
