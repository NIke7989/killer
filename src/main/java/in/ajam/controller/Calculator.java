package in.ajam.controller;

public class Calculator {
	
	
	public  int  addition(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int add = calculator.addition(4, 7);
		System.out.println("Additon of two numbers:" + add);
	}

}
