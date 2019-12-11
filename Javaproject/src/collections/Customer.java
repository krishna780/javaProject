package collections;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUId=19L;
	int customerId;
	String cusName;
	int cusAge;
	public Customer(int customerId, String cusName, int cusAge) {
		this.customerId = customerId;
		this.cusName = cusName;
		this.cusAge = cusAge;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cusName=" + cusName + ", cusAge=" + cusAge + "]";
	}
	

}
