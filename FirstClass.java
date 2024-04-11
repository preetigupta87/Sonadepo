package sonaseriestestingpackage;

import java.util.Arrays;


public class FirstClass {


	public static void main(String[] agrs)
	{
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,6,4,5,9};
		
		int c = a.length;
		int d = b.length;
		
		System.out.println("commont elements of array ");
		
	for(int j=0; j<=c ; j++)
	{
		for(int k=0; k<=c;k++)
			
		{
			if (a[j] == b[k])
					{
				System.out.print(a[j]);	
				}
		}
		
	}
	
	}
		

		
	}

