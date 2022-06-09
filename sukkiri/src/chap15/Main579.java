package chap15;

public class Main579 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("エラーが起こった");
			System.out.println(e.getMessage());
		}
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は"
				+ (end - start) + "秒でした");
		

	}

}
