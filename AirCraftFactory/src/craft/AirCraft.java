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
   private int aircraftstrength;

     // Manager function
   public AirCraft(String name1,int aircraftstrength1)
   { 
     name=name1;
     aircraftstrength=aircraftstrength1;
   }

   // Access function
   // get
   public String getName() { return name; }
   public int getAircraftstrength(){return aircraftstrength;}
 
   
}
