package ai.jobiak.otherclasstypes;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape sRef;
		sRef = new Rectangular();
		sRef.area();
		System.out.println("Area of Rectangle is "+sRef.area());
		
		sRef = new Circular();
		sRef.area();
		System.out.println("Area of circle  is "+sRef.area());
		
		sRef = new Cone();
		sRef.area();
		System.out.println("Area of cone is "+sRef.area());
		
		sRef = new Cuboid();
		sRef.area();
		System.out.println("Area of cuboid is "+sRef.area());
		
		sRef = new Rambous();
		sRef.area();
		System.out.println("Area of rambous is "+sRef.area());
		
		sRef = new Pentagon();
		sRef.area();
		System.out.println("Area of pentagon is "+sRef.area());
		
		sRef = new Parallogram();
		sRef.area();
		System.out.println("Area of parallogram is "+sRef.area());
		
		sRef = new Sphere();
		sRef.area();
		System.out.println("Area of sphere is "+sRef.area());
		
		sRef = new Hexagon();
		sRef.area();
		System.out.println("Area of hexagon is "+sRef.area());
		
		sRef = new Square();
		sRef.area();
		System.out.println("Area of square is "+sRef.area());
				
	}

}
