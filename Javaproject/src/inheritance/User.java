package inheritance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
//	private static final long serialVersionUid = 7829136421241571165L;
	private String firstName;
	private String lastName;
	private int accountNumber; 
	private Date dateOpened;
	public User(String firstName, String lastName, int accountNumber, Date dateOpened) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.dateOpened = dateOpened;
	}
	public User() {
		super();
	}
	public final String getFirstName() {
		return firstName;
	}
	public final void setFirstName(String aNewfirstName) {
		firstName = aNewfirstName;
	}
	public final String getLastName() {
		return lastName;
	}
	public final void setLastName(String aNewlastName) {
		lastName = aNewlastName;
	}
	public final int getAccountNumber() {
		return accountNumber;
	}
	public final void setAccountNumber(int aNewaccountNumber) {
		accountNumber = aNewaccountNumber;
	}
	public final Date getDateOpened() {
		return new Date(dateOpened.getTime());
	}
	public final void setDateOpened(Date aNewDate) {
	Date newDate = new Date(aNewDate.getTime());
		dateOpened = aNewDate;
	}
	private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException 
    {       
        firstName = aInputStream.readUTF();
        lastName = aInputStream.readUTF();
        accountNumber = aInputStream.readInt();
        dateOpened = new Date(aInputStream.readLong());
    }
 
    private void writeObject(ObjectOutputStream aOutputStream) throws IOException 
    {
        aOutputStream.writeUTF(firstName);
        aOutputStream.writeUTF(lastName);
        aOutputStream.writeInt(accountNumber);
        aOutputStream.writeLong(dateOpened.getTime());
    }

}
