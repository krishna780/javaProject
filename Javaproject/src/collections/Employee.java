package collections;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;
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
	
	public int compareTo(Employee anotherEmployee) {
		// TODO Auto-generated method stub
		return this.getId()-anotherEmployee.getId();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) return true;
		if (obj == null ||getClass() != obj.getClass())return true;
		Employee employee =(Employee) obj;
		return id==employee.id;
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hashCode(id);
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", joiningDate=" + joiningDate + "]";
	}
	
}
