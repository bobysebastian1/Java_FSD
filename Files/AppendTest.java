package Files;
import java.io.*;
class AppendTest {
	// TO append string into a file
	public static void appendStrToFile(String fileName,
									String str)
	{
		try {
			// object of BufferedWriter class
			BufferedWriter out = new BufferedWriter(
				new FileWriter(fileName, true));
			out.write(str);
			out.close();
		}

		
		catch (IOException e) {
			System.out.println("exception occurred" + e);
		}
	}

	// main driver method
	public static void main(String[] args) throws Exception
	{
		try {
			BufferedWriter out = new BufferedWriter(
				new FileWriter("E:\\Users\\LENOVO\\Downloads\\Mphasis\\testFile3.txt"));

			// Writing on. file
			out.write("Hello How Are You???\n");
			out.close();
		}
		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
		
		try {
			BufferedReader in = new BufferedReader(
				new FileReader("E:\\Users\\LENOVO\\Downloads\\Mphasis\\testFile3.txt"));
			String mystring;

			//  there is content in string condition holds true
			while ((mystring = in.readLine()) != null) {
				System.out.println("The File Before Modification:  "+mystring);
			}
		}
			catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
		
		String fileName = "E:\\Users\\LENOVO\\Downloads\\Mphasis\\testFile3.txt";
		String str = "This is India, How Are you Now?????";
		
		appendStrToFile(fileName, str);
		// Let us print modified file
		try {
			BufferedReader in = new BufferedReader(
				new FileReader("E:\\Users\\LENOVO\\Downloads\\Mphasis\\testFile3.txt"));
			String mystring;

			//  there is content in string condition holds true
			while ((mystring = in.readLine()) != null) {
				System.out.println("");
				System.out.println(mystring);
				
			}
		
		}
			catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
	}
}


