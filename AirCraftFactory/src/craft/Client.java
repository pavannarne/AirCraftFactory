package craft;

import java.util.ArrayList;
import java.util.Iterator;

public class Client

{
	private static final int ArrayList = 0;
	private static final int AirCraft = 0;

	public static void main(String args[])  {

		System.out.println(Factory.buildAirCraft("Apache").toString());
		System.out.println(Factory.buildAirCraft("cathy").toString());
		
//		AirCraft craft = Factory.buildAirCraft("Apache");
//		System.out.println("The Strengh of the Air Craft: "
//				+ craft.getAircraftstrength());
		System.out.println(Factory.buildAirCraft("ethihod").toString());

		
	}
	
	
}
