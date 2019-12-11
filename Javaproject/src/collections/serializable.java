package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serializable {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Hello");
		a1.add("hi");
		a1.add("helek");
		try {
			FileOutputStream fos= new FileOutputStream("/home/kgona/Desktop/Java/file");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(a1);
			oos.close();
			fos.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println(e);
		}
		System.out.println("successfully deployed");
		
		ArrayList<Object> arr=new ArrayList<Object>();
		
	try {
		FileInputStream fis=new FileInputStream("/home/kgona/Desktop/Java/file");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		 arr=(ArrayList<Object>) ois.readObject();
		ois.close();
		fis.close();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("filenot found");
		e.getMessage();
		return;
	}
	for(Object tmp:arr)

	System.out.println(tmp);}
}
