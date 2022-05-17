package ai.jobiak.otherclasstypes;

public class Pentagon extends Shape {
	double side=5;
	double diagonal=10;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (diagonal*side)/2;
	}

}
