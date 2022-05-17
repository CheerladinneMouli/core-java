package ai.jobiak.enumtask;

public class FatoryDrinks {

	public static void main(String[] args) {
		
		Drinks cool;
		for(Drinks drink:Drinks.values()) {
			System.out.println("Brand=" + drink +", Price=" + drink.showPrice() + "index=" + drink.ordinal());
		}
	}

}
