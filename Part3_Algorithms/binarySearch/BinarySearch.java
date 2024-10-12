package binarySearch;

public class BinarySearch {

	public static void main(String[] args)
	{
		int[] arr = new int[] {8, 9, 21, 30, 48, 55, 57, 64, 84, 94};
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
		
		System.out.println("\nIndex of target: " + binaryIterative(arr, 48));
	}
	
	// Iterative
	public static int binaryIterative(int arr[], int x)
	{
		int low = 0, high = arr.length - 1;
		
		while(low <= high)
		{
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid] < x)
				low = mid+ 1;
			else
				high = mid - 1;
		}
		
		return -1;
	}
	

}
