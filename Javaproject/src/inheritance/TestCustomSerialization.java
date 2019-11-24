package inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.Calendar;

public class TestCustomSerialization {
   public static void main(String[] args) {
	User MyDetails = new User("krishna", "gona",102825, new Date(Calendar.getInstance().getTimeInMillis()));
	try {
		FileOutputStream fileOut = new FileOutputStream("User.usr");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.close();
		fileOut.close();
	}catch (IOException i) {
	
		// TODO: handle exception
		i.printStackTrace();
	}
	User deserializedUser = null;
	try {
		FileInputStream filein = new FileInputStream("User.usr");
		ObjectInputStream in =new ObjectInputStream(filein);
		deserializedUser = (User) in.readObject();
		in.close();
		filein.close();
		
		System.out.println(deserializedUser.getFirstName());
		System.out.println(deserializedUser.getLastName());
		System.out.println(deserializedUser.getAccountNumber());
		System.out.println(deserializedUser.getDateOpened());
		
	}catch (IOException Ioe) {
		Ioe.printStackTrace();
		// TODO: handle exception
   }catch (ClassNotFoundException cnfe) {
	// TODO: handle exception
cnfe.printStackTrace();
   }
}
}
