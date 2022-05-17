package ai.jobiak.enums;

public enum Drinks {
	
	
	Sprite,Maaza,Thumpsup,Sevenup,Cococola,MountBlue,Fanta,Pepsi,Redbull,Mirinda;
	
	String Brand;
	int Price;
	double liters;
	Drinks() {
		// TODO Auto-generated constructor stub
	}
	Drinks(int price, double liters, String brand) {
		this.Price = price;
		this.liters = liters;
		this.Brand = brand;
	}
	void showliters() {
		// TODO Auto-generated method stub
		
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public double getWeight() {
		return liters;
	}
	public void setWeight(double weight) {
		liters = weight;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
}
