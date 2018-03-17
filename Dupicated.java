import java.util.Arrays;

public class Dupicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 9, 10, 6, 5, 14, 30, 9, 10, 6, 20, 07, 21, 02, 07};
		//dp d = new dp();
		System.out.println("The Duplicated array is " );
		for(int i =0; i<arr.length; i++){
		System.out.print(arr[i] +"\t");
		}
		System.out.println();
		System.out.println("The unique array is " );
		int[] d =  eliminateDuplicates(arr);
		for(int i =0; i<arr.length; i++){
			System.out.print(d[i] + "\t");
	}
	}


	static int[] eliminateDuplicates(int[] arr){
		int i, n = arr.length;
		for(i=0; i<n; i++)
		{
			for(int j =i+1; j<n; j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j] = arr[n-1];
					n--;
					j--;
				}
			}
		}
		int[] arr1 = Arrays.copyOf(arr, n);
	//	System.out.println("\n");
		//System.out.println("THE UNIQUE ARRAY IS ");
	//for(int p=0; p<arr1.length; p++){
		//int arr[p] = arr1[p];
		//}
		return arr;
	}
}