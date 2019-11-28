package javaInputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstream {
	public static void main(String[] args) {
		FileOutputStream fop=null;
		File file;
		String content="This is the next context";
		try {
			file = new File("/home/kgona/Desktop/Java/newFile.txt");
			fop = new FileOutputStream(file);
			if(!file.exists()) {
				file.createNewFile();
			}
			byte[] contentInBytes = content.getBytes();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
			System.out.println("done");
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(fop !=null) {
					fop.close();
				}
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
	}

}
