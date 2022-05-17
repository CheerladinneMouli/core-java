package day1;

public class CreateStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreContacts store=new StoreContacts();
		Contact3 con1= new Contact3(1,"mouli",9322960412L,"moulich@jobiak.com","jobiak");
		Contact3 con2= new Contact3(2,"pavani",9745296041L,"pavani@gmail.com","TCS");
		Contact3 con3= new Contact3(3,"hari",8652960412L,"hari001@gmail.com","wipro");

         Contact3 contact3Array[]=new Contact3[3];
         contact3Array[0]=con1;
         contact3Array[1]=con2;
         contact3Array[2]=con3;
         
         store.setContacts(contact3Array);
         //System.out.println(store);
         Contact3 contacts[]= store.getContacts();
         
         for(Contact3 contact:contacts) {
        	 
        	 System.out.println(contact); 
         }

	}

}
