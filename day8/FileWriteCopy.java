package com.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCopy {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D:\\abc.txt");
		FileWriter fw = new FileWriter("D:\\abc1.txt");
		int ch;
		while ((ch = file.read())  != -1)
		{
			fw.write(ch);
		}
		file.close();
		fw.close();
		
		System.out.println("File copied to new file");
	}
}


