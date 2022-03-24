package hashmapMainUtility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import hashmapMainUtility.HashmapMain;

public class Hashmap2 {

	public static void main(String[] args) {

		//Creating HashMap  
		HashMap<String,Integer> bouquet=new HashMap<String,Integer>();  
		bouquet.put("Rose",10);  //Put elements in Map  
		bouquet.put("Jasmine",20);    
		bouquet.put("Lily",30);  
				
		//coverting hashmap values to ArrayList
			List<String> keyList = new ArrayList<String>(bouquet.keySet());
			System.out.println(keyList);
				
		//coverting hashmap values to ArrayList
			List<Integer> valueList = new ArrayList<Integer>(bouquet.values());
			System.out.println(valueList);
		
		//cost of bouquet
		int cost = HashmapMain.modifyList(valueList);
		System.out.println(cost);
			
	}

}
