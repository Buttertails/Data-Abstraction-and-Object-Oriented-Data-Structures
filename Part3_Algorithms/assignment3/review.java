package assignment3;

public class review {
	
	
	public void selectionSort(int[] arr)
	{
		int x;
		for(int i = 0; i < arr.length - 1; i++)
		{
			int s = i;
			
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[s])
				{
					s = j;
				}
			}
			
			x = arr[s];
			arr[s] = arr[i];
			arr[i] = x;
		}
	}
	
	public int binarySearch(int[] arr, int x)
	{
		int low = 0, high = arr.length;
		
		while(low <= high)
		{
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid] < x)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
				
		}
		return -1;
	}
	
	public void selectionSort2(int[] arr)
	{
		int x;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			int s = i;
			
			for(int j = i  + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[s])
					s = j;
			}
			x = arr[s];
			arr[s] = arr[i];
			arr[i] = x;
		}
	}
	
	public int binarySearch2(int[] arr, int x)
	{
		int low = 0, high = arr.length;
		
		while(low <= high)
		{
			int mid = low + (high - low) / 2;
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid] < x)
				mid = low + 1;
			else
				mid = high - 1;
		}
		
		return -1;
	}
	
	public void insertionSort(int[] arr)
	{
		int num, j;
		for(int i = 1; i < arr.length; i++)
		{
			num = arr[i];
			j = i - 1;
			while(num < arr[j] && j >= 0)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = num;
		}
			
	}
	
	public void selectionSort3(int[] arr)
	{
		int x;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			int s = i;
			
			for(int j = i  + 1; j < arr.length; j++)
			{
				if(arr[s] > arr[j])
					s = j;
			}
			x = arr[s];
			arr[s] = arr[i];
			arr[i] = x;
		}
	}
	
	public int binarySearch3(int[] arr, int x)
	{
		int low = 0, high = arr.length - 1;
		
		while(low <= high)
		{
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid] < x)
				low = mid + 1;
			else
				high = mid - 1;
		}
		
		return -1;
	}
	
	public void insertionSort3(int[] arr)
	{
		int num, j;
		
		for(int i = 1; i < arr.length; i++)
		{
			num = arr[i];
			j = i - 1;
			while(num < arr[j] && j >= 0)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			num = arr[j + 1];
		}
	}
}
