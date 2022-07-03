package com.pages;

public class Str {
	String str = null;

	void m1() {
		str = "parag";
	}

	void m2() {
		System.out.println(str);
	}
}

class TestStr {
	public static void main(String[] args) {
		Str s = new Str();
		s.m2();
	}
}
