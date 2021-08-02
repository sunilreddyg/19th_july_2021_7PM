package mq.java.methods.static_methods;

public class InputDevices 
{
	
	
	//Staticmethods [It Contains static specifier]
	public static void mouse()
	{
		System.out.println("mouse active");
	}
	
	public static void keybaord()
	{
		System.out.println("mouse active");
	}
	
	public static void touch()
	{
		System.out.println("touch feature is active");
	}
	

	public static void main(String[] args)  //Runnable method
	{
		
		/*
		 * Here runnable method and resuable method both are static speicifier
		 * methods. IN this case we can call methods without object creation
		 */
		
		mouse();
		keybaord();
		touch();

	}

}
