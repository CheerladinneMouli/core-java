package ai.jobiak.enums;

import java.util.Arrays;

public class DrinksArray {
	
	Drinks d[]=new Drinks[10];
	
	public DrinksArray() {
		
	}

	public Drinks[] getD() {
		return d;
	}

	public void setD(Drinks[] d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "DrinksArray [d=" + Arrays.toString(d) + "]";
	}
}