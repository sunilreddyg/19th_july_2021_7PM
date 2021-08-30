package other_package_methods;

import mq.java.methods.instant_method.RobotA;
import mq.java.methods.static_methods.InputDevices;
import mq.java.variables.Demo_Variables;

public class Calling_Other_package_methos_and_variabels 
{

	public static void main(String[] args)
	{
		
		//Calling instant methods
		RobotA obj=new RobotA();
		obj.walk();
		obj.run();
		
		
		//Calling static methods
		InputDevices.mouse();
		InputDevices.keybaord();
		
		
		//Instant Variable [Method may return may not but variabel should return value]
		Demo_Variables var=new Demo_Variables();
		String Instname=var.name;
		System.out.println(Instname);
		
		//Calling static varaible 
		String username=Demo_Variables.user;
		System.out.println(username);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Note:-->
		 * 			INorder to call other package methods and varaible we should
		 * 			follow thest rules
		 * 	
		 * 			Rule:-->
		 * 					1. Mehtod or variable should be declare with public modifier
		 * 						then ony we can access outside package.
		 * 					
		 * 					2. Should import package to current constrcuted class
		 * 					
		 * 					Sytnax for import package:-->
		 * 			
		 * 						import packagename.*;
		 * 						import packagename.Classname;
		 * 
		 * 					Where shoudl we write import:-->
		 * 			
		 * 							Under package and Before class
		 */

	}

}
