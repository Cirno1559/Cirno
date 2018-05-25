package com.hxzy;

import java.io.File;
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入要查询的路径：(格式例如：e:\\JAVA\\day01)");
	String str = input.next();
	input.close();
	File f1 = new File(str);
	if(!f1.exists()) {
		System.out.println("该路径不存在！");
	}else {
		File[] listFiles = f1.listFiles();
		for (File file : listFiles) {
			System.out.println(file.getName());
		}
	}
}
}
