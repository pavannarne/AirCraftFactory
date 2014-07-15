package craft;
import java.util.ArrayList;

import craft.AirCraft;

public class Factory 
{
	private static ArrayList<AirCraft> airCraftList;
	/**
	 * 
	 * @param name
	 */
//public static AirCraft buildAirCraft(String name)
//	
//	{
//		AirCraft aircraft1 = null;
//		for(AirCraft craft:airCraftList)
//		{
//			if(name.equalsIgnoreCase(craft.getName())) 
//			{
//				aircraft1 = craft;
//			}
//		}
//		return aircraft1;
//	   	
//	}
//
//public static AirCraft buildAirCraft(int strength)
//
//{
//	AirCraft aircraft1 = null;
//	for(AirCraft craft:airCraftList)
//	{
//		if(AirCraft.getAircraftstrength()==strength)
////		if(strength.equalsIgnoreCase(craft.getAircraftstrength()) 
//		{
//			aircraft1 = craft;
//		}
//	}
//	return aircraft1;
//   	
//}
	/**
	 * This method will return the bulk of aircraft that has the same name.
	 * 
	 * @param name aircraft name
	 * @return list of aircraft
	 */
	public static ArrayList<AirCraft> buildAircrafts(String name)
	{
		ArrayList<AirCraft> list = new ArrayList<AirCraft>();
		for(AirCraft air : airCraftList ) {
			if(name.equalsIgnoreCase(air.getName())) {
				list.add(air);
			}
		}
		return list;
	}
	
	
	public static ArrayList<AirCraft> buildAircrafts(int strength)
	{
		ArrayList<AirCraft> list = new ArrayList<AirCraft>();
		for(AirCraft a : airCraftList ) {
			if(AirCraft.getAircraftstrength()==strength) {
				list.add(a);
			}
		}
		return list;
	}
	static
	{
		airCraftList = new ArrayList<AirCraft>();
//		/airCraftList=new ArrayList<Chopper>();
		AirCraft airCraft = new Chopper("Apache", 100,200);
		AirCraft airCraft4 = new Chopper("Apache", 150,200);
		AirCraft airCraft5 = new Chopper("Apache", 150,250);
		
		AirCraft airCraft2 = new Chopper("cathy", 150,200);
		AirCraft airCraft3 = new Chopper("ethihod", 200,250);
		airCraftList.add(airCraft);
		airCraftList.add(airCraft2);
		airCraftList.add(airCraft3);

		airCraftList.add(airCraft4);
		airCraftList.add(airCraft5);
		
	}

}
