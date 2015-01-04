package com.study.operation;

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

	public void Oper() {
		Scanner s = new Scanner(System.in);

		System.out.print("2개의 숫자를 입력하시오: ");
		int a = s.nextInt();
		int b = s.nextInt();

		while (true) {
			System.out.print("1.합     2.곱    3.나누기  4.빼기  5.끝내기   ");
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
				System.out.println("연산 끝!!");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}

		}
	}

}
