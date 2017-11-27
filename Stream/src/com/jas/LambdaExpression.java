package com.jas;

interface Show {
	public void show(int i);
}


public class LambdaExpression {

	public static void main(String[] args) {
	
		Show obj;
		obj=i->System.out.println("Hello : "+i);
		obj.show(6);
	}
	
}
