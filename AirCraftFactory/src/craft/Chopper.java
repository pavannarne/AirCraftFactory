package craft;

public class Chopper extends AirCraft
{
	 //Data members
		private int chopperstrength;
		
		//manager function (constructor)
		public Chopper(String name1, int aircraftstrength1,int chopperstrength1) 
		{
			super(name1, aircraftstrength1);
			chopperstrength=chopperstrength1;
			
		}
		//Access function
		//get
		public int getChopperstrength()
		{
			return chopperstrength;
			}
		
		 public String toString()
		   {
			   return "AirCraft Description\n_________________________\n "
			   			+ "\nAirCraft is made by : "+getName()+
					   "\nAirCraft Strength is :"+getAircraftstrength()+
					   "\n Chopper Strength is :"+chopperstrength+
					   "\n_________________________";
		   }
}
