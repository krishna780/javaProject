package logic;

public class Emp_address implements Cloneable{
	String  add1;
	String add2;
	public Emp_address(String add1, String add2) {
		super();
		this.add1 = add1;
		this.add2 = add2;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
