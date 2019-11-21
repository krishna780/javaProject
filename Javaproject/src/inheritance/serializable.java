package inheritance;
import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class A implements Serializable{
	int i;
	public A(int i) {
		this.i = i;
	}
}
@SuppressWarnings("serial")
class B extends A{
	  
	int j;
	
	public B(int i ,  int j) {
		super(i);
		this.j = j;
		// TODO Auto-generated constructor stub
	}	
}
public class serializable {
	public static void main(String[] args) throws Exception {
		B b1 = new B(10,20);
		System.out.println("j = " + b1.i);
		System.out.println("j = "+b1.j);
		FileOutputStream fos =new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b1);
		oos.close();
		fos.close();
		System.out.println("Object has been serialized");
		
		FileOutputStream fis =new FileOutputStream("abc.ser");
		ObjectOutputStream ois = new ObjectOutputStream(fis);
		
		B b2 =[b]ois.
		ois.close();
		fis.close();
		System.out.println("object deserialized");
		System.out.println("j= "+b2.i);
		System.out.println("j= "+b2.j);
	}
	

}
