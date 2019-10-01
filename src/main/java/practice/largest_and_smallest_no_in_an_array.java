package practice;

import java.util.Arrays;

public class largest_and_smallest_no_in_an_array {

	public static void main(String[] args) {
	int[] arr= {34,45,-1200,67,23,-100};
	int largest = arr[0];
	int smallest = arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i]>largest)
		{
			  largest =arr[i];
			
			
		}
		else
		

			if(arr[i]<smallest)
			{
				  smallest =arr[i];
				
				
			}
	}
		
	System.out.println("arr is "+Arrays.toString(arr));
	System.out.println("largest is " +largest);
	System.out.println("smallest is "+ smallest);
	}

}
