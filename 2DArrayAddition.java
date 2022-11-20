package smJv;
public class ArrayAddition2D {
	public static void main(String[] args) {
		int arr1[][]={{5,7,9},{7,96,26},{54,78,232}};
		int arr2[][]={{34,876,908},{67,987,34},{87,78,98}};
		int sum[][]=new int[3][3];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("\n	Sum of array1 and array2:~\n");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("\t");
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print("  "+sum[i][j]);
			}
			System.out.println();
		}
	}
}
