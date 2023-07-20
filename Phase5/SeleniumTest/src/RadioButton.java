import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class RadioButton {

			public static void main(String[] args) throws Exception
			{
				WebDriver driver = new ChromeDriver();
				driver.get("file:///E:/WebSites/bank.html");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				WebElement radiobox1 = driver.findElement(By.id("in"));
				radiobox1.click();
				if(radiobox1.isSelected())
				{
					System.out.println("Country is : " + radiobox1.getAttribute("value"));
				}
				Thread.sleep(2000);
				WebElement radiobox2 = driver.findElement(By.id("uae"));
				radiobox2.click();
				if(radiobox2.isSelected())
				{
					System.out.println("Country is : " + radiobox2.getAttribute("value"));
				}	
				
				driver.quit();
	}

}
