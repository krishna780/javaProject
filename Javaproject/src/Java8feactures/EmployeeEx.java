package Java8feactures;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeEx {
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;
	
	public EmployeeEx(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "EmployeeEx [id=" + id + ", name=" + name + ", salary=" + salary + ", joiningDate=" + joiningDate + "]";
	}
	
}
