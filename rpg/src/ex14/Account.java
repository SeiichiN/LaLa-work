package ex14;

public class Account {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" + balance + "(口座番号@" + accountNumber + ")";
	}
	
	public boolean _equals(Account a) {
		String a1 =  this.accountNumber.trim();
		if (a1.equals(a.accountNumber.trim())) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account) {
			Account a2 = (Account) o;
			String a1 = this.accountNumber.trim();
			if (a1.equals(a2.accountNumber.trim())) {
				return true;
			}
		}
		return false;
	}
}
