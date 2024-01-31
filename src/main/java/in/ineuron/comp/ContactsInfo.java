package in.ineuron.comp;

import java.util.Date;
import java.util.Set;

public class ContactsInfo {
	
	private Set<Long> phoneNumber;
	private Set<Date> date;
	
	@Override
	public String toString() {
		return "ContactsInfo [phoneNumber=" + phoneNumber + ", date=" + date + "]";
	}

	public Set<Long> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
		System.out.println("Implementation class of Set is " + phoneNumber.getClass().getName());
	}

	public Set<Date> getDate() {
		return date;
	}

	public void setDate(Set<Date> date) {
		this.date = date;
	}
	
	
}
