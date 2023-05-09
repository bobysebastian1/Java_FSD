package Module1;

public class methodOverload {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
    public void area(int l,double b) 
    {
         System.out.println("Area of Rectangle : "+(l*b));
    }

	public static void main(String[] args) {
		
		methodOverload m = new methodOverload();
		m.area(3,4);
		m.area(2);
		m.area(3,4.5);
	}
	

}
