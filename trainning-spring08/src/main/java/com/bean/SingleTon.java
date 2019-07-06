package com.bean;

public class SingleTon {

	private SingleTon()
	{
		
	}
	
	private static SingleTon st;
	
	
	public static SingleTon getInstance()
	{
		if(null==st)
			st=new SingleTon();
		
		return st;
	}
	
	public static void main(String[] args) {
		 
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		
		
		System.out.println(s1+"--"+s2);
	}

}
