package javaInputOutput;

import java.io.FileInputStream;

public class fileinputstream {
      public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("/home/kgona/Desktop/Java/newFile.txt");
			int i = fin.read();
			System.out.println((char)i);
			fin.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
