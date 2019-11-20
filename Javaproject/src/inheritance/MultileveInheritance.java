package inheritance;

class Bike
{
	public int gear;
	public int speed;
	public Bike(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	public void applySpeed(int increment) {
		speed += increment;
	}
	public String toString() {
		return ("gears of the car"+gear +"\n" +"speed of the car"+speed);
		
	}
}
class MountainBikes extends Bicycle{
	
	public int seatHeight;
	public int wheels;
	public MountainBikes(int gear, int speed, int startHeight,int wheel) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		seatHeight = startHeight;
		wheels = wheel;
		
	}public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	public void setWheel(int setwheels) {
		wheels=setwheels;
	}
	@Override
	public String toString() {
		return(super.toString()+"\n sseatheight"+seatHeight +"\n wheels changes"+wheels);
	}
}
class NormalBikes extends Bicycle{
	
	int feat;

	public NormalBikes(int gear, int speed, int feval) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		feat = feval;
	}
	public void setFeet(int setfeat) {
		feat=setfeat;
	}
	@Override
	public String toString() {
		return(super.toString()+"\n feat value"+feat);
	}
	
}

public class MultileveInheritance {
	public static void main(String[] args) {
		NormalBikes mb = new NormalBikes(3,5,10);
		System.out.println(mb.toString());
		MountainBikes mb1 = new MountainBikes(4,7,80,45);
		System.out.println(mb1.toString());

		
		
	}

}
