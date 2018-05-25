package com.hxzy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		write();
		read();
	}


	@SuppressWarnings("unchecked")
	private static void read() {
		try {
			ObjectInputStream ios = new ObjectInputStream(new FileInputStream("E:\\JAVA\\day17\\day17\\Ch11_Java输入输出流\\food.obj"));
			Map<String, Food> map = (Map<String, Food>) ios.readObject();
			ios.close();
			map.values().stream().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	

	private static void write() {
		Food f1 = new Food("西瓜", 3.5);
		Food f2 = new Food("橘子", 5);
		Map<String, Food> map = new HashMap<String, Food>();
		map.put("西瓜", f1);
		map.put("橘子", f2);
		
			try {
				File file = new File("E:\\JAVA\\day17\\day17\\Ch11_Java输入输出流\\food.obj");
				if(!file.exists()) {
					file.createNewFile();
				}
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(map);
				oos.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
	}
}
