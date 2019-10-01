package practice;

import java.util.HashMap;

import java.util.Map;


public class unique_characters_in_string {
//need to check string contains unique characters or not
	static String word1= "Shghjhkj78bvwrssdfpidermann";
	String word2="Spiderman";
	static char[] y=word1.toCharArray();
	        static int size =y.length;
	        static int i;
	
	public static void main(String[] args) {
		Map<Character, Integer> hmap=new HashMap<Character, Integer>(); 
		while(i!=size)
		{
			if(hmap.containsKey(y[i])==false)
			{   hmap.put(y[i], 1);
			}
			else
			{
			
				int oldvalue= hmap.get(y[i]);
				  int newvalue=oldvalue+1;
				  hmap.put(y[i], newvalue);
			}
			++i;
		}
			
			for( Map.Entry<Character,Integer> data: hmap.entrySet())
			{
				if(data.getValue()>1)
				{
					
					//System.out.println("string doesnt contains unique characters");
					System.out.println(data.getKey());
				
				}
				
			}
			//System.out.println(" unique character");
			
			
		}
			
		 		
	}


