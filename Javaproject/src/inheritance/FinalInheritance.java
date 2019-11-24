package inheritance;

abstract class shape{
	private double width;
	private double height;
	public shape(double width, double height) {
		this.width = width;
		this .width = width;
	}
	public final double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	abstract double getArea();
}
class Rectangle extends shape{

	public Rectangle(double width, double height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	final double getArea() {
		// TODO Auto-generated method stub
		return this.getHeight()*this.getWidth();
	}
	
}
class Square extends shape{

	public Square(double slide) {
		super(slide,slide);
		// TODO Auto-generated constructor stub
	}

	@Override
final double getArea() {
		// TODO Auto-generated method stub
		return this.getHeight() * this.getWidth();
	}
	
}

public class FinalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        shape s1 = new Rectangle(10,20);
		shape s2 = new Square(10);
        
        System.out.println("width of s1= "+s1.getWidth());
        System.out.println("height of s1= "+s1.getHeight());
        
        System.out.println("width of s2= "+s2.getWidth());
        System.out.println("height of s2= "+s2.getHeight());
        
        
        System.out.println("area of s1= "+s1.getArea());
        System.out.println("area of s2= "+s1.getArea());
	}

}
