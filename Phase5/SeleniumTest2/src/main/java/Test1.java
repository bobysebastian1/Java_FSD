import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver  n = new ChromeDriver();
		n.manage().window().maximize();
		n.get("http://www.olx.com/");
		Thread.sleep(3000);
		n.quit();

	}

}
