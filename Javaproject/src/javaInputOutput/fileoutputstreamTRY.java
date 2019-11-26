package javaInputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstreamTRY {
	public static void main(String[] args) {
		File file = new File("/home/kgona/Desktop/Java/newFile.txt");
		String content ="This is new script";
		try(FileOutputStream fop=new FileOutputStream(file)){
			if(!file.exists()) {
				file.createNewFile();
			}
			byte[] contentInBytes =content.getBytes();
					fop.write(contentInBytes);
			fop.flush();
			fop.close();
			System.out.println("Done");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
