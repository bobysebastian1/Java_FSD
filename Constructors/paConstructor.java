package Module1;

	
	//parameterized constructor
	class Std{
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println(" ");
		}
	}


	public class paConstructor {
	public static void main(String[] args) {

		Std std1=new Std(2,"Akhil");
		Std std2=new Std(4,"Akhila");
		std1.display();
		std2.display();
			}
	}



