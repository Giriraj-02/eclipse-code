package com.exception;

public class FirstExampleException {
	
	public static void main(String[] args){
		
		try {
			int a[]={1,2,3,4};
			
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutofBoundsExceptio e){
			System.out.println(e);
			
		}  finally {
			System.out.println("Code always Execute");
		}
		
	}

}
