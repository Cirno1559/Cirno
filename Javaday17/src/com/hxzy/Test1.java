package com.hxzy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		reader();
		copy();
	}

	private static void copy() {
		try {
			FileInputStream in = new FileInputStream("E:\\eclipsework\\Javaday17\\test.txt");
			FileOutputStream out = new FileOutputStream("E:\\eclipsework\\Javaday17\\test1.txt");
			byte [] bytes = new byte[1024];
			while(in.read(bytes) != -1) {
				out.write(bytes);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void reader() {
		try {
			FileReader reader = new FileReader("E:\\eclipsework\\Javaday17\\test.txt");
			StringBuilder sb = new StringBuilder();
			while (reader.ready()) {
				char c = (char) reader.read();
				sb.append(c);
			}
			reader.close();
			System.out.println(sb);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
