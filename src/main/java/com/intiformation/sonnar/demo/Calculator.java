package com.intiformation.sonnar.demo;

public class Calculator {

	public int add(int a, int b) {
		System.out.println("Dans la méthode add");
		int resultat = 0;
		
		return a+b;
	}
	
	public int mul(int a, int b) {
		System.out.println("Dans la méthode mul");
		return a*b;
	}
}
