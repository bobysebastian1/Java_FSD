package Throw;

public class throwdemo {

	public static void main(String[] args)
    {

        int a=1234,b=00,rs;


        try
        {
            if(b==0)        
                throw new ArithmeticException("Can't divide by zero.");
            else
            {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }

        System.out.print("\nEnd of program.");
    }



	}


