package framework.Datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.util.Properties;

public class Read_Data_From_propertyFiles 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		FileInputStream fi=new FileInputStream("src\\framework\\Datadriven\\PropertyFiles\\inputdata.properties");
		System.out.println("file located");
		
		//Load all property objects to repository
		Properties repository=new Properties();
		repository.load(fi);
		
		
		//Get any object property value using it's keyname
		String brname=repository.getProperty("browsername");
		System.out.println(brname);
		
		
		//Get any object property value using it's keyname
		String appurl=repository.getProperty("url");
		System.out.println(appurl);
		
		
		
		

	}

}
