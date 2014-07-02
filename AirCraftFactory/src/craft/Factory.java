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
	public static AirCraft buildAirCraft(String name) {
		AirCraft aircraft1 = null;
		for(AirCraft craft:airCraftList) {
			if(name.equalsIgnoreCase(craft.getName())) {
				aircraft1 = craft;
			}
		}
		return aircraft1;
	   	
	}
	/**
	 * this is the place u need create many objects, and added to the arrayList
	 */
	static{
		airCraftList = new ArrayList<AirCraft>();	
		AirCraft airCraft = new Chopper("Apache", 100,200);
		airCraftList.add(airCraft);
		
	}

}
