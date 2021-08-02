package mq.java.methods.instant_method;

public class RobotA 
{
	
	//Instant method [Because it doesn't contain static specifier]
	public void walk()
	{
		System.out.println("walk executed");
	}
	
	//Instant method [Because it doesn't contain static specifier]
	public void run()
	{
		walk();
		System.out.println("run executed");
	}
	
	//Instant method [Because it doesn't contain static specifier]
	public void jump()
	{
		System.out.println("jump executed");
	}


	

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to call instant methods and instant variable we should
		 * create object to class.
		 * 			
		 * 		Classname obj=new Classname();
		 * 		obj.methodname();
		 */
		
		RobotA obj=new RobotA();
		obj.walk();
		obj.run();
		obj.jump();
	}

}
