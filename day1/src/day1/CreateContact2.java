package day1;
public class CreateContact2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact2 con1=new Contact2();
		/*System.out.println(con1.getContactid());
		System.out.println(con1.getFirstName());
        System.out.println(con1.getMobhileno());
        System.out.println(con1.getEmail());
        System.out.println(con1.getCompany());*/
        //initializing the data
        con1.setContactid(4);
        con1.setFirstName("mouli");
        con1.setMobhileno(6309136705L);
        con1.setEmail("mouli.ch@jobiak.com");
        con1.setCompany("jobiak");
        //accessing the data
        System.out.println(con1.getContactid());
		System.out.println(con1.getFirstName());
        System.out.println(con1.getMobhileno());
        System.out.println(con1.getEmail());
        System.out.println(con1.getCompany());
	}

}