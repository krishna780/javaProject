package inheritance;
// base class created
class Bicycle{
	// bicycle class has two fields
	public int gear;
	public int speed;
	//the bicycle class has one constructor
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		
	}
	// bicycle method has three methods
	public void applyBreake(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	// tostring method are used to print bicycle class info
	public String toString() {
		return("no of gears are "+gear +"\n" +"speed of bicycle is "+speed);
	}
}
//subclass created
class MountainBike extends Bicycle{
	// The mountainBike subclass adds one more fields

	public int seatHeight;
	
	//the mountainBike subclass has one more constriuctor
	
	public MountainBike(int gear, int speed ,int startHeight) {
		//invoking super class constructor
		super(gear, speed);
		// TODO Auto-generated constructor stub
		seatHeight = startHeight;
	}
	//the mountainBike subclass adds one more method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	//overriding toString() method
	@Override
	public String toString() {
		return (super.toString()+"\nseat height is "+seatHeight);
	}
}
//driver class
public class Test {
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(6,100,25);
		System.out.println(mb.toString());
	}

}
