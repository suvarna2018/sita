package com.sbi.loans.carloans;

public class UnClass implements DeuxClass {
	int a=2, b=3, result=0;
	public void addition() {
		result=a+b;
		System.out.println("addition of a&b are:"+result);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnClass obj=new UnClass();
		obj.addition();
		obj.division();	
	}


	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("division overriden DeuxClass");
	}

}
