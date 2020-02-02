package com.jh.variable;

//	클래스의 풀 네임 : com.jh.variable.A_Variable
public class A_Variable {
	public void declareVariable() {
	// 변수 선언후 초괴화 하는 메소드
	// 1. 논리형
	boolean isTrue;
	// Flag Check

	// 2. 숫자형

	// 2-1. 정수형
	byte bNum; // 1
	short sNum; // 2
	int iNum; // 4
	long lNum; // 8

	// 2-2. 실수형
	float fNum; // 4
	double dNum;// 8

	// 3. 문자형
	char ch;

	// 4. 문자열 (참조형)
	String str;

	isTrue = true;
	bNum = 1;
	sNum = 2;
	iNum = 4;
	lNum = 8L; // 자동 형변환

	fNum = 4.0f;
	dNum = 8.0d;

	ch = 'A';
	str = "A";

	System.out.println("isTrue의 값 : " + isTrue);
	System.out.println("bNum의 값 : " + bNum);
	System.out.println("sNum의 값 : " + sNum);
	System.out.println("iNum의 값 : " + iNum);
	System.out.println("lNum의 값 : " + lNum);
	System.out.println("fNum의 값 : " + fNum);
	System.out.println("dNum의 값 : " + dNum);
	System.out.println("ch의 값 : " + ch);
	System.out.println("str의 값 : " + str);
	}
	public void initVariable() {

		// 변수 선언과 동시에 초기화 하는 메소드

		// 1. 논리형
		boolean isTrue = false;

		// 2. 숫자형

		// 2-1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8;

		// 2-2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0;

		// 3. 문자형
		char ch = '가';

		// 4. 문자열
		String str = "안녕하세요.";

		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);

	}
}
