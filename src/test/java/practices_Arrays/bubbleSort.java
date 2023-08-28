package practices_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int a[]= {4,2,8,6,1};
		String a_value= Arrays.toString(a);
		int arrLen= a.length;
		System.out.println(a_value);
		System.out.println(a[0]);
		int temp=0;
		for(int r=0;r<arrLen;r++)
		{
			for (int c=r+1;c<arrLen;c++)
			{
				if(a[r]>a[c])
				{
					System.out.println(a[r]);
					temp=a[c];
					a[c]=a[r];
					a[r]=temp;
					System.out.println(a[r]);
				}
			}
			
		}
		
	
	}

}
