package Module1;


	
	class empInfo{
		int id;
		String names;
		
	void display() {
		System.out.println(id+" "+names);
		}
	}

	public class constructor {
	public static void main(String[] args) {

		empInfo emp1=new empInfo();
		empInfo emp2=new empInfo();

		emp1.display();
		emp2.display();
		}
	}


