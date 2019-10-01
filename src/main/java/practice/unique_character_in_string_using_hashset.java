package practice;

import java.util.HashSet;

public class unique_character_in_string_using_hashset {
     static String word= "spiderman";
     static char[] y =word.toCharArray();
     static int size=y.length;

 	public static void main(String[] args) {
 	 
    HashSet<Character> h = new HashSet<>();
    
    for(Character c: y)
    {
    
    if(h.add(c)==false)
    	
    {
    	
    	System.out.println(" not contain unique character");
    	System.exit(0);
    	
    }

	}System.out.println(" contain unique charcter");

}
}