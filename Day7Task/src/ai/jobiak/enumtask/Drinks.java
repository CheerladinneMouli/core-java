package ai.jobiak.enumtask;

public enum Drinks {
	
	Sprite(35),Maaza(50),Thumpsup(70),Sevenup(60),Cococola(100),MountBlue(50),Fanta(120),Pepsi(65),Redbull(25),Mirinda(50);
	
	int price;
	

	private Drinks(int price) {
		this.price = price;
	}
	
	int showPrice() {
		 
		return this.price;
	}

}
