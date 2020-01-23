package linkedlist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SetilazandDeserialization implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8465738930041L;
	transient int a;
	static int b;
	String name;
	int age;
	public SetilazandDeserialization(int a, String name, int age, int b) {
		super();
		this.a = a;
		this.name = name;
		this.age = age;
		SetilazandDeserialization.b = b;
	}
}
public class SerialExample{
	public static void printdat(SetilazandDeserialization object1) {
		System.out.println("name= "+object1.name);
		System.out.println("age= "+object1.age);
		System.out.println("a= "+object1.a);
		System.out.println("b="+object1.b);
		
	}
	public static void main(String[] args) {
		SetilazandDeserialization object=new SetilazandDeserialization(6, "krishna", 18, 1000);
		try {
			FileOutputStream fis=new FileOutputStream("test.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fis);
			oos.writeObject(object);
			oos.close();
			fis.close();
			System.out.println("Object has been serialized \n"+"before data serialization");
			printdat(object);
			object.b=2000;
		}catch (IOException ie) {
			// TODO: handle exception
			System.out.println("Io exeception is caugjhted");
		}
		object=null;
		try {
			FileInputStream fis=new FileInputStream("test.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			object=(SetilazandDeserialization)ois.readObject();
			ois.close();
			fis.close();
			System.out.println("object has been deserialized");
			printdat(object);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("file not found");
		}
}}
