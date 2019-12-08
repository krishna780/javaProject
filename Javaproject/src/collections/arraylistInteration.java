package collections;

public class arraylistInteration {
private int empid;
private String ename;
private String designation;
private double salary;


public arraylistInteration(int empid, String ename, String designation, double salary) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.designation = designation;
	this.salary = salary;
}
public int getEmpid() {
	return empid;
}
public String getEname() {
	return ename;
}
public String getDesignation() {
	return designation;
}
public double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "arraylistInteration [empid=" + empid + ", ename=" + ename + ", designation=" + designation + ", salary="
			+ salary + "]";
}



}
