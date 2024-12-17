package com.day8;

import java.io.FileReader;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		FileReader  file = new FileReader("D:\\abc.txt");
		int ch;
		while ((ch = file.read())  != -1)
		{
			System.out.print((char)ch);
		}
		file.close();
	}

}
