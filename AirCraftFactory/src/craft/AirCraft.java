package craft;
// AirCraft.java
public class AirCraft
{
   // Data members
   private String name ;
   private int aircraftstrength;

   // Helping function
   private void trace(String s)
   { 
      System.out.println(s);
   }
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


// move these to other class. 
 class Chopper extends AirCraft
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
	public int getChopperstrength(){return chopperstrength;}
}
	

	
	
	
