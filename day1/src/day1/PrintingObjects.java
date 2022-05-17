package day1;
public class PrintingObjects {

	public static void main(String[] args) {
		
		Contact3 contact= new Contact3(1,"mouli",9652960412L,"moulich@jobiak.com","jobiak");
		System.out.println(contact.getClass().getTypeName());
		System.out.println(contact);

	}

}
