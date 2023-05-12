package Files;
import java.io.*;
public class WriteFile {
	public static void main(String[] args) throws IOException{
        writeFileUsingFileClass();
    }
	private static void writeFileUsingFileClass() throws IOException
    {
          File file = new File("E:\\Users\\LENOVO\\Downloads\\Mphasis\\testFile4.txt");
           
          //To Write the Content in the File
          FileWriter writer = new FileWriter(file);
          writer.write("Once upon a time, there was a Greek King, Midas."
          		+ "He was very rich and had lots of Gold. He had a daughter, who he loved a lot.\n"
          		+ "One day, Midas found an angel in need of help. He helped her and in return she agreed to grant a wish."
          		+ "Midas wished that everything he touched would turn into gold. His wish was granted"
          		+ "On his way home, he touched rocks and plants and they turned into gold.\n"
          		+ "As he reached home, in excitement he hugged his daughter, who turned into gold.\n"
          		+ "Midas was devastated and he had learnt his lesson. Upon learning his lesson, Midas asked the angel to take his wish away.");
          writer.close();
          System.out.println("Writed Successfully");
          
          
          //To Read the Written Content from the File
          try {
  			BufferedReader in = new BufferedReader(
  				new FileReader("E:\\Users\\LENOVO\\Downloads\\Mphasis\\testFile4.txt"));
  			String mystring;

  			//  there is content in string condition holds true
  			while ((mystring = in.readLine()) != null) {
  				System.out.println(mystring);
  			}
  		}
  			catch (IOException e) {
  			System.out.println("Exception Occurred" + e);
  		}
  	}
    }

