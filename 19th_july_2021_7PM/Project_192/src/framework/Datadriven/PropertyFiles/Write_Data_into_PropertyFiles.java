package framework.Datadriven.PropertyFiles;

import java.io.FileOutputStream;
import java.util.Properties;

public class Write_Data_into_PropertyFiles {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Create object for properties
		Properties obj=new Properties();
		
		//Adding objects to repository
		obj.setProperty("Result1", "TestPass");
		obj.setProperty("Result2", "Testfail");
		obj.setProperty("Result3", "TestPass");

	
		//Create fileoupt
		FileOutputStream output=new FileOutputStream("src\\framework\\Datadriven\\PropertyFiles\\OP.properties");
		obj.store(output, "New Test Result");


	}

}
