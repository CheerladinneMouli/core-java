package day1;
public class CreateContact3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact3 con1=new Contact3(2,"mouli",6309136705L,"mouli123@gmail.com","jobiak");
		System.out.println(con1.getContactid());
		System.out.println(con1.getFirstName());
        System.out.println(con1.getMobhileno());
        System.out.println(con1.getEmail());
        System.out.println(con1.getCompany());
        //initializing the data
        /*con1.setContactid(4);
        con1.setFirstName("mouli");
        con1.setMobhileno(6309136705L);
        con1.setEmail("mouli.ch@jobiak.com");
        con1.setCompany("jobiak");
        */
        //accessing the data
        con1.setMobhileno(9652960412L);
        System.out.println(con1.getContactid());
		System.out.println(con1.getFirstName());
        System.out.println(con1.getMobhileno());
        System.out.println(con1.getEmail());
        System.out.println(con1.getCompany());
	}

}