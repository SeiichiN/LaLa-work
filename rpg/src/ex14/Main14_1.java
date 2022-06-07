package ex14;

import world.Hero;

public class Main14_1 {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);
		
		a.accountNumber = " 4649";
		Account a2 = new Account();
		a2.accountNumber = "4649 ";
		if (a.equals(a2)) {
			System.out.println("同じ");
		} else {
			System.out.println("ちがう");
		}
		
		Hero h = new Hero();
		if (a.equals(h)) {
			System.out.println("同じ");
		} else {
			System.out.println("ちがう");
		}
	}

}
