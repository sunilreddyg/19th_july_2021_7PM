package mq.java.methods.methodtypes;

public class MethodTypes 
{
	//Void is a method type it doesn't return any value
	public void method1()
	{
		int a=100;
		System.out.println(a);
	}
	
	
	
	/*
	 * => Other than valid all method types return value
	 * => We can define otherthan void  [Variables,Arrays,Collections,Classes,Interfaces --etc]
	 * => return value  should be write at the end of the method body
	 * => The return value and method type value should match
	 * => Finally it return value to methodname
	 */
	
	
	public int method2()
	{
		int b=200;
		return b;
	}
	
	public String method3()
	{
		return "Hello";
	}
	
	
	

	public static void main(String[] args) 
	{
		
		MethodTypes obj=new MethodTypes();
		obj.method1();				//Void method
		
		int x=obj.method2();		//Integer return method
		System.out.println(x);
		
		String var=obj.method3();   //String return method
		System.out.println(var);
		

	}

}
