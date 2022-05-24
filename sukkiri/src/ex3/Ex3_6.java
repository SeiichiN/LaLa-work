package ex3;
public class Ex3_6 {
  public static void main(String[] args) {
    System.out.println("数あてゲーム");
    int ans = new java.util.Random().nextInt(10);
    System.out.println("com:" + ans);
    for (int i = 0; i < 5; i++) {
      System.out.println(i + ": 0～9の数字を入力してください");
      @SuppressWarnings("resource")
	int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans) {
        System.out.println("アタリ");
        break;
      } else {
        System.out.println("ちがいます"); 
      }
    }
    System.out.println("ゲームを終了します");
  }
}