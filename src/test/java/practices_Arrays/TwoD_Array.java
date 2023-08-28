package practices_Arrays;

public class TwoD_Array {

	public static void main(String[] args) {
		int arr[][]= {{7,8,9},{1,5,9},{3,5,7}};
		
		for(int r=0;r<arr.length;r++)
		{
			System.out.println();
			for(int c=0;c<arr.length;c++)
			{
				System.out.print(arr[r][c]+"  ");
				
			}
			
		}
		
	}

}
