package craft;
/**
 * This class is base class for all aircraft that flying in the air. 
 * 
 * @author yyakup
 */
public class AirCraft
{
   // Data members
   private String name ;
   private static int aircraftstrength;

     // Manager function
   public AirCraft(String name1,int aircraftstrength1)
   { 
     name=name1;
     aircraftstrength=aircraftstrength1;
   }

   // Access function
   // get
   public String getName() { return name; }
   public static int getAircraftstrength(){return aircraftstrength;}
 
   
   public String toString() {
		return "AirCraft Description\n_________________________\n "
				+ "\nAirCraft is made by : " + getName()
				+ "\nAirCraft Strength is :" + getAircraftstrength()
				+ "\n_________________________\n";
	}
}
