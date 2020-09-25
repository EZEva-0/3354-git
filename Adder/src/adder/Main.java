package adder;

public class Main 
{
	public static void main(String[] args) 
	{
		int i = 0;
        	try
		{
			if(!args[0].equals("-"))
				i = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Invalid character in first arugument");
		}
		try 	
		{
            		int result = addArguments(args);
            		System.out.println(result);
       		} 
		catch (IllegalArgumentException ex) 
		{

            		System.err.println("Please provide at least one integer.");
        	}
    	}
    	private static int addArguments(String[] args) 
	{
		int temp = 0;
		
		if(args[0].equals("-"))
			for(int i=1; i < args.length; i++)
			{
				if(Integer.valueOf(args[i]) >= 0)
					temp -= Integer.valueOf(args[i]);
				else
					temp += Integer.valueOf(args[i]);
			}	
		
		for(int o=0; o<args.length; o++)
			temp += Integer.valueOf(args[o]);
        	
		return temp;
    	}
}
