package Module1;

public class stringDemo {

	public static void main(String[] args) {
		//methods of strings
				System.out.println("Methods of Strings");
				
				String sl=new String("Welcome to Java");
				System.out.println(sl);
				System.out.println(sl.length());

				//substring
				String s1="Welcome to Java";
				System.out.println(sl.length());
				System.out.println(s1.substring(2));

				//String Comparison
				
				String s2="Heldo";
				System.out.println(s1.compareTo(s2));

				//IsEmpty
				String s4="";
				System.out.println(s1.isEmpty());
				System.out.println(s4.isEmpty());


				//toLowerCase
				String s5="Hello";
				System.out.println(s1.toLowerCase());
				System.out.println(s5.toUpperCase());
				
				//replace
				String s6="Heldo";
				//String replace=s1.replace('l', 'd');
				System.out.println(s1.replace('o', '*'));

				//equals
				String x="Welcome to Java";
				String y="WeLcOmE tO JaVa";
				String z="Welcome to Java";
				System.out.println(x.equals(y));
				System.out.println(x.equals(z));
		 
				System.out.println("\n");
				System.out.println("Creating StringBuffer");
				//Creating StringBuffer and append method
				StringBuffer s=new StringBuffer("Welcome to Java! ");
				s.append("Enjoy your learning, ");
				s.append(",Nice Pleasure to Join us!!! ");
				System.out.println(s);

				//insert method
				s.insert(5, 'w');
				System.out.println(s);
				
				//replace method
				StringBuffer sb=new StringBuffer("Hello How Are You!!!");
				System.out.println(sb);
				sb.replace(0, 2, "hEl");
				System.out.println(sb);

				//delete method
				sb.delete(0, 1);
				System.out.println(sb);
				
				//StringBuilder
				System.out.println("\n");
				System.out.println("Creating StringBuilder");
				StringBuilder sb1=new StringBuilder("Happy ");
				sb1.append("Learning ");
				sb1.append("Learners ");
				System.out.println(sb1);

				System.out.println(sb1.delete(0, 1));

				System.out.println(sb1.insert(0, "Welcome & H"));

				System.out.println(sb1.reverse());
						
				//conversion	
				System.out.println("\n");
				System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				
				String str = "Hello"; 
		        
		        // conversion from String object to StringBuffer 
		        StringBuffer sbr = new StringBuffer(str); 
		        sbr.reverse(); 
		        System.out.println("String to StringBuffer");
		        System.out.println(sbr); 
		          
		        // conversion from String object to StringBuilder 
		        StringBuilder sb3 = new StringBuilder(str); 
		        sb3.append("world"); 
		        System.out.println("String to StringBuilder");
		        System.out.println(sb3); 
		        System.out.println(sb3.reverse());
			}
		





	}


