package ai.jobiak.otherclasstypes;

public class Hexagon extends Shape {
	double Side=5;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3*Math.sqrt(3))/2*Side*Side;
	}

}
