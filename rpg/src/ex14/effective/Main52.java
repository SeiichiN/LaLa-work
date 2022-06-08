package ex14.effective;

import java.util.HashMap;
import java.util.Map;

public class Main52 {

	public static void main(String[] args) {
		Map<PhoneNumber, String> m = new HashMap<>();
		// PhoneNumber pn = new PhoneNumber(707, 867, 5309);
		m.put(new PhoneNumber(707, 867, 5309), "Jenny");
		System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
		
		PhoneNumber pn1 = new PhoneNumber(707, 867, 5309);
		PhoneNumber pn2 = new PhoneNumber(707, 867, 5309);
		System.out.println(pn1.equals(pn2));
		System.out.println(pn1.hashCode());
		System.out.println(pn2.hashCode());
		
		System.out.println(m.get(pn1));
	}

}
