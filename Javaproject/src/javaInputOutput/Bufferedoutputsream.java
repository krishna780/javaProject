package javaInputOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferedoutputsream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File file = new File("/home/kgona/Desktop/Java/neFile.txt");
       FileOutputStream fileOutputStream=null;
       BufferedOutputStream bufferedOutputStream =null;
       try {
		fileOutputStream = new FileOutputStream(file);
		bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		
		bufferedOutputStream.write("this is an example of writing data to a file".getBytes());
		bufferedOutputStream.write("using BufferedOutputStream".getBytes());
		bufferedOutputStream.flush();
		
	} catch (IOException e) {
		e.printStackTrace();
		// TODO: handle exception
	}finally {
		try {
			if(fileOutputStream!=null) {
				fileOutputStream.close();
			}
			if(bufferedOutputStream!=null) {
				bufferedOutputStream.close();
			}
		}catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	System.out.println("copied data");
       
	}

}
