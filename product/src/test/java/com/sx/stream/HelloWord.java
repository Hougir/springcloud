package com.sx.stream;

public class HelloWord{
	private static volatile HelloWord HELLOWORD; 
	private HelloWord(){}
	public static HelloWord getInstance(){
		if(null == HELLOWORD){
			synchronized(HelloWord.class){
				if(null == HELLOWORD){
					HELLOWORD = new HelloWord();
				}
			}
		}
		return HELLOWORD;
	}
	public static void main(String[] args){
		HelloWord a = getInstance();
		HelloWord b = getInstance();
		System.out.println("a=" + a.hashCode());
		System.out.println("b=" + b.hashCode());
	}

}