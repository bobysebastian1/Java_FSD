package Module1;

public class arrays {

	public static void main(String[] args) {
		//single-dimensional array
		int a[]= {10,20,30,40,50,60,70};
		for(int i=0;i<7;i++) {
		System.out.println("Elements of array at " +i  +"th position: "  +a[i]);
		}


		//multidimensional array
		int b[][] = {{2, 4, 6, 8}, 
		            {3, 6, 9 , 10 ,1 , 7 } };
		      
		      System.out.println("\nLength of row 1 : " + b[0].length);
		      System.out.println("\nLength of row 2 : " + b[1].length);
		      
		      }
		


	}


