package ex14;

import java.util.Objects;

public class Account2 {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" + balance + "(口座番号@" + accountNumber + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account2 other = (Account2) obj;
		return Objects.equals(accountNumber, other.accountNumber);
	}
	
}
