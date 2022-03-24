package hashmapMainUtility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class HashmapMain {
	
   //generic method to find cost of bouquet
	public static int modifyList(List<Integer> valueList)
	{		
		int cost = 0;
		for(Integer i : valueList)
		{
			//System.out.println(i);
			cost = cost + i;			
		}		
		//System.out.println(cost);
		return cost;	
	}
	
	public static void main(String[] args) 
	{
		//Creating HashMap  
		HashMap<String,Integer> bouquet=new HashMap<String,Integer>();  
		bouquet.put("Rose",1);  //Put elements in Map  
		bouquet.put("Jasmine",2);    
		bouquet.put("Lily",3);  
				
		//coverting hashmap values to ArrayList
			List<String> keyList = new ArrayList<String>(bouquet.keySet());
			System.out.println(keyList);
				
		//coverting hashmap values to ArrayList
			List<Integer> valueList = new ArrayList<Integer>(bouquet.values());
			System.out.println(valueList);
		
		//cost of bouquet
		int cost =  modifyList(valueList);
		System.out.println(cost);
			
	}
}
