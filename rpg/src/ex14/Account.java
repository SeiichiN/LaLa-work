package ex14;

public class Account {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" + balance + "(口座番号@" + accountNumber + ")";
	}
	
	public boolean equals(Account a) {
		String a1 =  this.accountNumber.trim();
		if (a1.equals(a.accountNumber.trim())) {
			return true;
		}
		return false;
	}
}
