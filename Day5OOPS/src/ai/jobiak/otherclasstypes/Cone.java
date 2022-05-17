package ai.jobiak.otherclasstypes;

public class Cone extends Shape {
	double radius=10;
	double SlantHeight=10;
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*(radius+SlantHeight);
	}

}
