package javaInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileinputstreamtry {
	public static void main(String[] args) {
		File file=new File("/home/kgona/Desktop/Java/newFile.txt");
		try(FileInputStream fis=new FileInputStream(file)){
			System.out.println("Total file size to read(in bytes) : "+fis.available());
			int content;
			while((content = fis.read()) != -1){
				System.out.println((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
