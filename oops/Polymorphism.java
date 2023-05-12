package oops;

public class Polymorphism {
	
	    public int sum(int x, int y) 
	    { 
	        return (x * y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y * z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x / y); 
	    } 

	public static void main(String[] args) {
		Polymorphism s = new Polymorphism(); 
        System.out.println("Result is: "+s.sum(10, 71)); 
        System.out.println("Result is: "+s.sum(10, 17, 19)); 
        System.out.println("Result is: "+s.sum(3.5, 18.7)); 
    


	}

}
