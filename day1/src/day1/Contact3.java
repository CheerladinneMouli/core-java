 package day1;
public class Contact3 {
	private int contactid;
	private String FirstName;
	private long mobhileno;
	private String email;
	private String company;
	//how to make objects method ready by using contacts
	public Contact3() {
		// TODO Auto-generated constructor stub
	}
	public Contact3(int contactid, String firstName, long mobhileno, String email, String company) {
		this.contactid = contactid;
		this.FirstName = firstName;
		this.mobhileno = mobhileno;
		this.email = email;
		this.company = company;
	}
	
	//mutators or accessor methods or set get methods
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public long getMobhileno() {
		return mobhileno;
	}
	public void setMobhileno(long mobhileno) {
		this.mobhileno = mobhileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Contact3 [contactid=" + contactid + ", FirstName=" + FirstName + ", mobhileno=" + mobhileno + ", email="
				+ email + ", company=" + company + "]";
	}
	
	
}
