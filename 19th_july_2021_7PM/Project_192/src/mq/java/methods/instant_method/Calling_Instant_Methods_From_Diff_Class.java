package mq.java.methods.instant_method;

public class Calling_Instant_Methods_From_Diff_Class {

	public static void main(String[] args) 
	{
		
		/*
		 * IN Order to call instant method from different class
		 * we should create object for class
		 * 			
		 * 		Classname obj=new ClassName();
		 * 		obj.methodname();
		 */
		 RobotA ra=new RobotA();
		 ra.run();
		 ra.jump();

		
	}

}
