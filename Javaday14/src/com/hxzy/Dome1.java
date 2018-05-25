package com.hxzy;

public class Dome1 {

	public static void main(String[] args) {
		int sum = 10000/2;
		int a=0;
		int b=0;
		int n=sum;
		do {
			int i,j;
			i =(n+a)/4;
			j =(n+b)/2;
			n =i+j;
			a= i%4;
			b= j%2;
			sum+=n;
		}while(n > 1);
		System.out.println(sum);
	}

}
