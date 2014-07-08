package craft;


public class Client 

{
	public static void main(String args[])
	
	{
		
	
		
		System.out.println(Factory.buildAirCraft("Apache").toString());
		System.out.println(Factory.buildAirCraft("cathy").toString());
		
		System.out.println(Factory.buildAirCraft("ethihod").toString());


	}


}
