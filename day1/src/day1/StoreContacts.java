package day1;
import java.util.Arrays;

public class StoreContacts {
	double range[]= new double[3];
	int nums[]=new int[3];
Contact3 contacts[]=new Contact3[3];

public StoreContacts() {
	// TODO Auto-generated constructor stub
}

public StoreContacts(Contact3[] contacts) {
	super();
	this.contacts = contacts;
}

public Contact3[] getContacts() {
	return contacts;
}

public void setContacts(Contact3[] contacts) {
	this.contacts = contacts;
}

}
