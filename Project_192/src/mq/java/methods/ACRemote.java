package mq.java.methods;

public class ACRemote 
{
	
	public void Turon()		//Public modifier allow method to call outside package
	{
		System.out.println("Turn on Executed");
	}
	
	public void Turnoff()
	{
		System.out.println("Turn on executed");
	}
	
	

	public static void main(String[] args)   //Runnable method
	{
		
		new ACRemote().Turon();
		new ACRemote().Turnoff();
		
		//Calling other class methods
		new TVRemote().ON();
		new TVRemote().OFF();
	}

}
