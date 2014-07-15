package craft;

import java.util.ArrayList;

public class PrintUtil 

{
//	public static void print(ArrayList<AirCraft> lists) 
	public static void print(ArrayList<AirCraft> airCraftList) 
	{
		/**
		 * loop the lists, and grab the aircraft, call the toString method here
		 */
		
		for(int i=0;i<airCraftList.size();i++)
		{
			AirCraft a1=airCraftList.get(i);
			System.out.println(a1.toString());
		}
	
	 }
}
