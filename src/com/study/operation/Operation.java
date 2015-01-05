package com.study.operation;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation {

	private int plus(int a, int b) {
		return a + b;
	}

	private int sub(int a, int b) {
		return a - b;
	}

	private int multi(int a, int b) {
		return a * b;
	}

	private float div(float a, float b) {
		return a / b;
	}

	private String makehex(int a) {

		return Integer.toHexString(a);
	}

	private String makehex2(int a) {
		String hexa="";
		ArrayList list = new ArrayList();
		ArrayList hex = new ArrayList();
		
		while (true) {
			if(a==0){
				break;
			}
			list.add(a % 16);
			a= a/16;
		}
		
		for(int i =list.size()-1; i >=0; i--){
			int n = (int)list.get(i);
			switch(n){
			case 10:
				hex.add('a');
				break;
			case 11:
				hex.add('b');
				break;
			case 12:
				hex.add('c');
				break;
			case 13:
				hex.add('d');
				break;
			case 14:
				hex.add('e');
				break;
			case 15:
				hex.add('f');
				break;
			default :
				hex.add(n);	
			}
		}
		
		for(int i =0; i<hex.size(); i++){
			hexa +=hex.get(i); 
		}
		return hexa;
	}

	public void Oper() {
		Scanner s = new Scanner(System.in);

		System.out.print("2개의 숫자를 입력하시오: ");
		int a = s.nextInt();
		int b = s.nextInt();

		while (true) {
			System.out
					.print("1.합     2.곱    3.나누기  4.빼기  5.16진수 변환   6.끝내기   ");
			int c = s.nextInt();

			if (c == 1) {
				System.out.println("합 : " + plus(a, b));
			} else if (c == 2) {
				System.out.println("곱 : " + multi(a, b));
			} else if (c == 3) {
				System.out.println("나누기 : " + div(a, b));
			} else if (c == 4) {
				System.out.println("빼기 : " + sub(a, b));
			} else if (c == 5) {
				System.out.println(a + " ->" + makehex2(a));
				System.out.println(b + " ->" + makehex(b));
			} else if (c == 6) {
				System.out.println("연산 끝!!");
				break;
			} else {
				System.out.println("그런 숫자는 없습니다. 다시 입력하세요.");
			}

		}
	}

}
