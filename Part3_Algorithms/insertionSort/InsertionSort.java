package insertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {30, 8, 57, 21, 64, 9, 48, 94, 84, 55};
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
		
		insertionIterative(arr);
		System.out.println();

		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");

	}
	
	public static void insertionIterative(int[] arr)
	{
		int num, j;
		for(int i = 1; i < arr.length; i++)
		{
			num = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] > num)
			{
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = num;
		}
	}
	
	/*
	public static void insertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int temp = arr[i];
			int j = i - 1;
			while()
		}
	}
*/
}
