package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class customerSerializable implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main(String[] args) {
	List<Customer> listcus=new ArrayList<Customer>();
	Customer napolean = new Customer(1900, "Ravi", 26);
	Customer muss = new Customer(1902, "gopi", 21);
	Customer hit = new Customer(1905, "krishna", 23);
	Customer sta = new Customer(1901, "kanth", 29);
	Customer gopi = new Customer(1988, "krishna", 26);
	listcus.add(napolean);
	listcus.add(muss);
	listcus.add(hit);
	listcus.add(sta);
	listcus.add(gopi);
	FileOutputStream fos=null;
	ObjectOutputStream oos = null;
	
	try {
		 fos=new FileOutputStream("/home/kgona/Desktop/Java/file");
		 oos=new ObjectOutputStream(fos);
		oos.writeObject(listcus);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	try {
		 fis=new FileInputStream("/home/kgona/Desktop/Java/file");
		 ois=new ObjectInputStream(fis);
ois.readObject();
		 ois.close();
		fis.close();
	}catch (Exception e) {
		// TODO: handle exception
		e.getMessage();
		System.out.println(e);
	}
	for(Customer cust:listcus)
		System.out.println(cust);

 }
}
