package javaInputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class fileinputstr {
public static void main(String[] args) throws IOException{
	
	FileInputStream fin = new FileInputStream("/home/kgona/Desktop/Java/newFile.txt");
	
	System.out.println(fin.getChannel());
	System.out.println(fin.getFD());
	System.out.println("Number of remaining bytes:"+fin.available());
	fin.skip(4);
	System.out.println("file contents :");
    int ch;
    while((ch=fin.read())!=-1)
    		System.out.println((char)ch);
    fin.close();
}
}
