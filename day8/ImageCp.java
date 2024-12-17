package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCp {

	public static void main(String[] args) throws IOException  {
		FileInputStream is = new FileInputStream("D:\\pikachu.webp");
		FileOutputStream fl = new FileOutputStream("D:\\pickachu1.webp"); 
		int ch;
		while ((ch = is.read())  != -1)
		{
			fl.write(ch);
		}
		is.close();
		fl.close();
		
		System.out.println("File copied to new file");
	}
}

