import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	public static void main(String[] args) throws Exception {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.id("email"));
	if(element.isDisplayed())
	{
		if(element.isEnabled())
		{
			// sending text to the textbox
			element.sendKeys("abcd@gmail.com"); 
			String enteredText =  element.getAttribute("value");
			System.out.println("Given Mail : " + enteredText);
			Thread.sleep(3000);
			element.clear();
			driver.findElement(By.className("inputtext"));
			Thread.sleep(3000);
			driver.findElement(By.name("pass"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='relativexapath']"));
			Thread.sleep(3000);
			// clicking hyperlink
			driver.findElement(By.linkText("Forgotten password?")).click();	
			Thread.sleep(3000);
			driver.findElement(By.linkText("Cancel")).click();	
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Forgot")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[name=email]"));
			driver.quit();		
			}
		else
			System.out.println("Textbox is Disabled");
	}
	else
		System.out.println("Textbox is not Visible");
}

}
