package craft;

import java.util.ArrayList;

public class Client

{
	public static void main(String args[])  {

		System.out.println(Factory.buildAirCraft("Apache").toString());
		System.out.println(Factory.buildAirCraft("cathy").toString());
		// aerospatiale is an object for Chopper class
		Chopper aerospatiale = new Chopper("american", 500, 50);
		System.out.println("Chopper strength : "
				+ aerospatiale.getChopperstrength());

		/**
		 * 
		 */
		AirCraft craft = Factory.buildAirCraft("Apache");
		System.out.println("The Strengh of the Air Craft: "
				+ craft.getAircraftstrength());
		System.out.println(Factory.buildAirCraft("ethihod").toString());

	}
	/**
	 * this method can be moved to other class,  such as PrintUtil.java
	 */
	public static void print(ArrayList<AirCraft> lists) {
		/**
		 * loop the lists, and grab the aircraft, call the toString method here
		 */
		
		
	}

}
