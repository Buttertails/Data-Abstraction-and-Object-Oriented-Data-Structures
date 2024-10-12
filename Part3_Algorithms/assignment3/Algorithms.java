package assignment3;

/**
 * This class contains and tests the selection sort,
 * insertion sort, and binary search algorithms.
 * @author Drew Elliott;
 */

public class Algorithms {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = (int)((Math.random() * 100) + 1);
			arr2[i] = (int)((Math.random() * 100) + 1);
		}
		
		System.out.println("selection sort test:");
		displayAll(arr1);
		selectionSort(arr1);
		displayAll(arr1);
		
		System.out.println("insertion sort test:");
		displayAll(arr2);
		insertionSort(arr2);
		displayAll(arr2);
		
		System.out.println("binary search test:");
		System.out.println("Index of target: " + binarySearch(arr1, arr1[4]));
		System.out.println("Index of target: " + binarySearch(arr2, arr2[6]));
	}
	
	/**
	 * selection sort algorithm
	 * @param arr an unsorted integer array 
	 */
	public static void selectionSort(int[] arr)
	{
		int x;
		for(int i = 0; i < arr.length - 1; i++)
		{
			int s = i;

			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[s])
					s = j;
			}
			
			x = arr[s];
			arr[s] = arr[i];
			arr[i] = x;
		}
	}
	
	/**
	 * insertion sort algorithm
	 * @param arr an unsorted integer array 
	 */
	public static void insertionSort(int[] arr)
	{
		int num, j;
		for(int i = 1; i < arr.length; i++)
		{
			num = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] > num)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = num;
		}
	}
	
	/**
	 * binary search algorithm
	 * @param arr a sorted integer array 
	 * @param x the target value 
	 * @return the index of the target
	 */
	public static int binarySearch(int[] arr, int x)
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
	
	/**
	 * display all elements in an integer array
	 * @param arr an integer array 
	 */
	public static void displayAll(int[] arr)
	{
		for(int i = 0; i < arr.length;  i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}
