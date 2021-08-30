package mq.java.methods.parameters;

public class RobotB 
{
	
	//Any thing under this method is hardcoded which means we can't change
	public void run()
	{
		System.out.println("run completed in 5 km speed");
	}
	
	
	//Method accept changes throw method parameter
	public void custom_run(int KM)
	{
		System.out.println(KM+"  --> Speed Completed");
	}
	
	//Method with multiple parameters [Use cama spearated to pass multiple parameters]
	public void methodA(int a, int b) 
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		
		RobotB rb=new RobotB();
		//calling method without parameter
		rb.run();
		
		//Calling method with single parameters
		rb.custom_run(10);
		rb.custom_run(13);
		rb.custom_run(4);
		
		//Calling method with multipel parameters
		rb.methodA(10, 30);
	}

}
