package com.hxzy;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		//�����쳣
		try {
			String s = null;
			int length = s.length();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ��֤��ѧ�쳣
		try {
			int i=1,j=0;
			int n;
			n=i/j;
		} catch (Exception e) {
			e.printStackTrace();
		}
		//���ָ�ʽ�쳣
		try {
				String number = "����";
				Integer s2 = Integer.parseInt(number);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//����Խ���쳣
		try {
			int [] a = new int[10];
			System.out.println(a[10]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//����ת���쳣
		try {
			Object a1 = "����";
			int a2 = (int)a1;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
