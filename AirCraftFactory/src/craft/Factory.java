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
<<<<<<< HEAD
	public static AirCraft buildAirCraft(String name) {
		AirCraft aircraft1 = null;
		for(AirCraft craft:airCraftList) {
			if(name.equalsIgnoreCase(craft.getName())) {
=======
	public static AirCraft buildAirCraft(String name)
	
	{
		AirCraft aircraft1 = null;
		for(AirCraft craft:airCraftList)
		{
			if(name.equalsIgnoreCase(craft.getName())) 
			{
>>>>>>> origin/master
				aircraft1 = craft;
			}
		}
		return aircraft1;
	   	
	}
	/**
	 * this is the place u need create many objects, and added to the arrayList
	 */
<<<<<<< HEAD
	static{
		airCraftList = new ArrayList<AirCraft>();	
		AirCraft airCraft = new Chopper("Apache", 100,200);
		airCraftList.add(airCraft);
=======
	static
	{
		airCraftList = new ArrayList<AirCraft>();	
		AirCraft airCraft = new Chopper("Apache", 100,200);
		AirCraft airCraft4 = new Chopper("Apache", 150,200);
		AirCraft airCraft5 = new Chopper("Apache", 150,250);
		
		AirCraft airCraft2 = new Chopper("cathy", 150,200);
		AirCraft airCraft3 = new Chopper("ethihod", 200,250);
		airCraftList.add(airCraft);
		airCraftList.add(airCraft2);
		airCraftList.add(airCraft3);
<<<<<<< HEAD
>>>>>>> origin/master
=======
		airCraftList.add(airCraft4);
		airCraftList.add(airCraft5);
>>>>>>> 30eef0ee78697cc4f06c6e35f823aad63d05ccd3
		
	}

}
