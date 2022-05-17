package ai.jobiak.coretask;

public class IceCream {
	
	String name;
	double weight;
	double price;
    String packing;
	
	public IceCream() {
		
	}

	public IceCream(String name, double weight, double price, String packing) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.packing = packing;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPacking() {
		return packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	@Override
	public String toString() {
		return "IceCream [name=" + name + ", weight=" + weight + ", price=" + price + ", packing=" + packing + "]";
	}
	
	

}
