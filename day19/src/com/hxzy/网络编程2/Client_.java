package com.hxzy.网络编程2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client_ {

	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("192.168.16.102", 9997);//创建客户端Socket
		Scanner input = new Scanner(System.in);
		while (true) {
			
			/*System.out.println("请输入内容：");
			String msg = input.next();
			
			if (msg.equals("exit")) {
				System.out.println("谢谢使用");
				break;
			}*/
			//向服务端发送请求，因为服务端是被动（女的），客户端是主动的（男的）
			/*OutputStream os = socket.getOutputStream();
			DataOutputStream dataout = new DataOutputStream(os);
			dataout.writeUTF(msg);*/
			//socket.shutdownOutput();
			
			InputStream in = socket.getInputStream();
			DataInputStream ins = new DataInputStream(in);
			
			String readUTF = ins.readUTF();
			System.out.println("服务端说：" + readUTF);
			
		}
		/*reader.close();
		isr.close();
		in.close();
		pw.close();
		os.close();*/
		
		//input.close();
		//socket.close();
	}

}
