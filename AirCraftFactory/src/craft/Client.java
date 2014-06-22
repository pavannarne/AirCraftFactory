package craft;


public class Client 

{
	public static void main(String args[])
	
	{
		//avenger is an object for AirCraft class
		AirCraft avenger=new AirCraft("american",500);
		
		System.out.println("Airlines Name : "+avenger.getName());
		System.out.println("AirCRaftStrength : " +avenger.getAircraftstrength());
		
		//aerospatiale is an object for Chopper class
		Chopper aerospatiale=new Chopper("american",500,50);
		System.out.println("Chopper strength : " +aerospatiale.getChopperstrength());


	}


}
