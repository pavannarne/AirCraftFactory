package craft;

import java.util.ArrayList;

public class PrintUtil 

{
	public static void print(ArrayList<AirCraft> lists) 
	{
		/**
		 * loop the lists, and grab the aircraft, call the toString method here
		 */
		AirCraft a1=null;
		for(int i=0;i<lists.size();i++)
		{
			System.out.println(a1.toString());
		}
	
	 }
}
