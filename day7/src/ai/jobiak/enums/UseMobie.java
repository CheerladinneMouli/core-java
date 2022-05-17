package ai.jobiak.enums;

public class UseMobie {

	public static void main(String[] args) {
		
		Mobile ref;
		ref= Mobile.valueOf("Google");
		System.out.println(ref);
		System.out.println(ref.showPrice());
		
		
		for(Mobile mobile:Mobile.values()) {
			System.out.println("Brand="+mobile+",Price="+mobile.showPrice()+"index="+mobile.ordinal());
		}
		
	}

}
