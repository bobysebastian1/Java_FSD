package oops;

public class ClassObjects {

		    String name; 
		    String adress; 
		    int age; 
		    String place; 
		    public ClassObjects(String name, String address, int age, String place) 
		    { 
		        this.name = name; 
		        this.adress = address; 
		        this.age = age; 
		        this.place = place;
		    } 
		    public String getName() 
		    { 
		        return name; 
		    } 
		    public String getAddress()
		    { 
		        return adress;
		    } 
		    public int getAge() 
		    { 
		        return age; 
		    } 
		    public String getPlace()
		    { 
		        return place;
		    } 
		    @Override
		    public String toString() 
		    { 
		        return("Hi my name is "+ this.getName()+ ".\nMy  "+ this.getAddress() + this.getAge()+ ", and"+ this.getPlace());
		    } 
		    public static void main(String[] args) 
		    { 
		        ClassObjects scot = new ClassObjects("Akhil","akhila",22,"Kasargod");
		        System.out.println(scot.toString()); 
		    } 
		


	}


