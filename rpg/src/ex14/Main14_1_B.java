package ex14;

public class Main14_1_B {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.accountNumber = "1465 ";
		
		SubAccount sa2 = new SubAccount();
		sa2.accountNumber = " 1465";

		if (a1.equals(sa2)) {
			System.out.println("同じ");
		} else {
			System.out.println("ちがう");
		}

		System.out.println("a1:" + a1.hashCode());
		System.out.println("sa2:" + sa2.hashCode());
	}

}
