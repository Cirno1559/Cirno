package com.hxzy.������2;

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
		Socket socket = new Socket("192.168.16.102", 9997);//�����ͻ���Socket
		Scanner input = new Scanner(System.in);
		while (true) {
			
			/*System.out.println("���������ݣ�");
			String msg = input.next();
			
			if (msg.equals("exit")) {
				System.out.println("ллʹ��");
				break;
			}*/
			//�����˷���������Ϊ������Ǳ�����Ů�ģ����ͻ����������ģ��еģ�
			/*OutputStream os = socket.getOutputStream();
			DataOutputStream dataout = new DataOutputStream(os);
			dataout.writeUTF(msg);*/
			//socket.shutdownOutput();
			
			InputStream in = socket.getInputStream();
			DataInputStream ins = new DataInputStream(in);
			
			String readUTF = ins.readUTF();
			System.out.println("�����˵��" + readUTF);
			
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
