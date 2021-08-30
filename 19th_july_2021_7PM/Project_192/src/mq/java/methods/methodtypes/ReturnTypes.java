package mq.java.methods.methodtypes;

public class ReturnTypes 
{
	
	public void productname()
	{
		String info="Iphone";
		System.out.println(info);
	}
	
	public double getPrice()
	{
		return 25000.00;
	}
	

	public static void main(String[] args) 
	{
		
		ReturnTypes obj=new ReturnTypes();
		obj.productname();   //Calling void method
		
		double new_price=obj.getPrice();
		System.out.println(new_price);
		
		

	}

}
