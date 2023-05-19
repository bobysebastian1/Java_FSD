package sorting;

public class BubbleSort {

	public static void main(String[] args)
	{
		int x[] = {103, 4456, 247, -12, 53};
		
		System.out.println("Actual Values : ");
		for(int n : x)
			System.out.print(n + "\t");
		
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		
		System.out.println("\nSorted Values in Asending Order : ");
		for(int n : x)
			System.out.print(n + "\t");
			}
}
