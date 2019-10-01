package practice;

public class copying_onestring_to_another {

	public static void main(String[] args) {
		String str="ashwini" ;
		char[] arr= str.toCharArray();
		  int size=arr.length;
	      char[] a=new char[size];
	      int i=0;
	      while(i!=size)
	      {
	    	  a[size-1-i]=arr[i];
	    	  
	    	i++;  
	      }
	      System.out.println(arr);
		System.out.println(a);
	}

}
