
public class ArrayofChoco {
	 private String choclatename;
	 private double weight;
	 double cost;
	public ArrayofChoco() {
		// TODO Auto-generated constructor stub
	}
	public ArrayofChoco(String choclatename, double weight,double cost) {
		this.choclatename = choclatename;
		this.weight = weight;
		this.cost = cost;
	}
		public String getChoclatename() {
		return choclatename;
	}
	public void setChoclatename(String choclatename) {
		this.choclatename = choclatename;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
		@Override
	public String toString() {
		return "ArrayofChoco [choclatename=" + choclatename + ", weight=" + weight + ", cost="
				+ cost + "]";
	}
	
}

