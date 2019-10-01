package practice;

public class covert_lower_case_to_upper_case {

	public static void main(String[] args) {
	String str="this is taj hotel";
//	String str1=str.toUpperCase();
//    System.out.println(str1);
//        str.
//	           
	  char[] y= str.toCharArray();
	   int size= y.length;
	   int i=0;
	   y[0]=(char)(y[0]-32);
	   while(i!=size)
	   {
		   if(y[i]==' ')
		   {
		   y[i+1]=(char) (y[i+1]-32);
		   }
		 i++;  
	  
	   }
	System.out.println(y);
	}

}
