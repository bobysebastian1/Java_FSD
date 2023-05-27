package Module1;
import java.util.*;
public class collections {

			public static void main(String[] args) {
				//creating arraylist
				System.out.print("ArrayList: ");
				ArrayList<String> city=new ArrayList<String>();   
			      city.add("Bangalore");//
			      city.add("Delhi");
			      city.add("Kochi");
			      System.out.println(city); 
			      
			    //creating vector
			      System.out.println("\n");
			      System.out.print("Vector: ");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(50); 
			      vec.addElement(80); 
			      System.out.println(vec);
				
				//creating linkedlist
			      System.out.println("\n");
			      System.out.print("LinkedList: ");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Alen");  
			      names.add("Kevin");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.print("HashSet: ");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(1011);  
			       set.add(1031);  
			       set.add(1021);
			       set.add(1041);
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.print("LinkedHashSet: ");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      	} 



	}

}
