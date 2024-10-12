package selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {30, 8, 57, 21, 64, 9, 48, 94, 84, 55};
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
		
		selectionSort(arr);
		System.out.println();

		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
	}

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
}
