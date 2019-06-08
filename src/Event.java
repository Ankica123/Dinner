import java.util.Scanner;

public class Event {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What kind of event is going to be?");
		String eventType = scan.next();
		
	    System.out.println("How many people will attend?");
	    String partySize = scan.next();
	    
	    String result = GetResult(eventType, partySize);
	    System.out.println(result);  
	}

	public static String GetResult(String eventType, String partySize)
	{
		String result = "";
		String mealSuggestion = "";
	    String prepSuggestion = "";
	    int partySizeNum = Integer.parseInt(partySize);
	    
	    if (eventType.equalsIgnoreCase("casual"))
	    {
	    	mealSuggestion = "sandwiches";
	    }
	    else if (eventType.equalsIgnoreCase("semi-formal"))
	    {
	    	mealSuggestion = "fried chicken";
	    }
	    else if (eventType.equalsIgnoreCase("formal"))
	    {
	    	mealSuggestion = "chicken parmesan";
	    }
	    
	    if (partySizeNum == 1)
	    {
	    	prepSuggestion = "in the microwave";
	    }
	    else if (partySizeNum < 13)
	    {
	    	prepSuggestion = "in your kitchen";
	    }
	    else
	    {
	    	prepSuggestion = "by a caterer";
	    }
	    
	    result = "Since you're hosting a " + eventType + " event for " +
	    		partySize + " participants, you should serve " +
	    		mealSuggestion + " prepared " + prepSuggestion;
	    
	    return result;
	}
}
