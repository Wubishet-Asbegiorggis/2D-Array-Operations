package smJv;
public class ArrayMultiplication2D {
	public static void main(String[] args) {
		int arr1[][]={{3,6,7,5},{2,4,7,5},{7,9,4,2}};
		int arr2[][]= {{1,7,8,5},{6,9,3,12},{23,0,9,14},{6,7,8,16}};
		int product[][]=new int[3][4];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<arr2.length;k++)
				{
					product[i][k]+=arr1[i][j]*arr2[j][k];
				}
			}
		}
		System.out.println("\n\tProduct of array1 and array2:~");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("\t ");
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(product[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
