package practice;

import java.util.HashMap;
import java.util.Map;

public class duplicate_subjects_using_hashmap {

	public static void main(String[] args) {
		int count=0;
		String[] subjects= {"java","phython","c#","java","c#","Ruby"};
		int size = subjects.length;
        int i=0;
        HashMap<String,Integer> hmap= new HashMap<String,Integer>();
		while(i!=size)
		{
			if(hmap.containsKey(subjects[i])==false)
			{   hmap.put(subjects[i], 1);
			}
			else
			{
			
				int oldvalue= hmap.get(subjects[i]);
				  int newvalue=oldvalue+1;
				  hmap.put(subjects[i], newvalue);
			}
			++i;
		}

		for(Map.Entry<String,Integer> names: hmap.entrySet())
		{
			if(names.getValue()>1)
			{
				
				System.out.println("duplicate subjects "+ names.getKey());
				count=count+1;
				
						
			}
			
			}System.out.println("count is "+count);
		
		
		
    	
    }
   
	
	     
	
	}

