import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("file:///E:/WebSites/Data%20Collection.html");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("Subject"));
		Thread.sleep(3000);
		Select locOption = new Select(dropdown);
		List<WebElement>  showall =  locOption.getOptions();
		
		for(WebElement w : showall)
		{
			System.out.println(w.getText());
		}
		locOption.selectByIndex(1);
		Thread.sleep(3000);
		driver.quit();

	}

}
