import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		//WebDriver ed = new EdgeDriver();
		//WebDriver fd = new FirefoxDriver();
		cd.manage().window().maximize();
		cd.get("http://www.google.com/");
	}

}
