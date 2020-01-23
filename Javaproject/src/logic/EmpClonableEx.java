package logic;
class EmpEx implements Cloneable{
	String id;
	String name;
	Emp_address add;
	
	public EmpEx(String id, String name, Emp_address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class EmpClonableEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp_address eadd= new Emp_address("usa", "india");
		EmpEx e1= new EmpEx("122344", "krishna", eadd);
		EmpEx e2= (EmpEx) e1.clone();
		System.out.println(eadd.add1);
System.out.println(e1.id +"name: "+e1.name);
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
	}
	

	
}
