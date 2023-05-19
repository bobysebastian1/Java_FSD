package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int y[] = {1040, 412, 722, -131, 455};
		
		System.out.println("Values Before Sorting: ");
		for(int num : y)
			System.out.print(num + "\t");
		
		for(int i=1;i<y.length;i++)
		{
			int temp = y[i];
			int j=i-1;
			while(j>=0 && y[j]>temp)
			{
				y[j+1] = y[j];
				j--;
			}
			
			y[j+1] = temp;
		}
		System.out.println("\nAfter Applying Insertion Sorting: ");
		for(int num : y)
			System.out.print(num +"\t");
	}

}
