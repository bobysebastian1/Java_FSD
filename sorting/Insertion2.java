package sorting;
import java.util.*;

public class Insertion2 {
			public void sort (int[] numbers) {
			for(int i=1;i<numbers.length;i++)
			{
				int temp = numbers[i];
				int j=i-1;
				while(j>=0 && numbers[j]>temp)
				{
					numbers[j+1] = numbers[j];
					j--;
				}
				
				numbers[j+1] = temp;
			}
		}			

		public static void main(String[] args) {
			Insertion2 i= new Insertion2();
				BubbleSort b= new BubbleSort();
				int[] numbers = new int [] {1040, 412, 722, -131, 455};
				i.sort(numbers);
				System.out.println(Arrays.toString (numbers));
			}

	}


