package ex14;

import java.util.ArrayList;
import java.util.List;

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
		
		a.accountNumber = "4649";
		List<Account> aList = new ArrayList<>();
		aList.add(a);
		showList(aList);
		a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		aList.remove(a);
		showList(aList);
	}
	
	private static void showList(List<Account> aList) {
		for (Account a : aList) {
			System.out.print("accountNumber:" + a.accountNumber);
			System.out.println(" balance:" + a.balance);
		}
		System.out.println("要素数:" + aList.size());
	}

}
