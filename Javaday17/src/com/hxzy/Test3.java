package com.hxzy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	do {
	System.out.println("请输入内容，退出请输入exit");
	String str = input.next();
	if(!str.equals("exit")) {
	writer(str);
	System.out.println();
	}else {
		input.close();
		return;
	}
	}while(true);
	
	
}

private static void writer(String str) {
	File file = new File("E:\\JAVA\\day17\\day17\\Ch11_Java输入输出流\\log.txt");
	try {
		if(!file.exists()) {
		file.createNewFile();
		}else {
		FileWriter os = new FileWriter(file, true); 
		char [] charArray = str.toCharArray();
		int i = 0;
		while(i < str.length()) {
			os.write(charArray[i]);
			i++;
		}os.close();
		}
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}
}
