import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Boxes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/WebSites/log.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Prompt Box
		System.out.println(driver.findElement(By.id("a")).getText());
		driver.findElement(By.id("PromptBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Kumar");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();  // clicking Ok button
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("a")).getText());
		driver.findElement(By.id("PromptBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss(); // clicking Cancel Button
		System.out.println(driver.findElement(By.id("a")).getText());
		Thread.sleep(3000);
		
		driver.quit(); // it will close the browser

	}

}
