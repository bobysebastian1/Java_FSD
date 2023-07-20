import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Forms {

			public static void main(String[] args) throws Exception {
				
				WebDriver driver = new ChromeDriver();
				driver.get("file:///E:/WebSites/Forms/Form.html");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				WebElement name = driver.findElement(By.id("pname"));
				name.sendKeys("Akgfery");
				Thread.sleep(2000);
				WebElement address = driver.findElement(By.id("address"));
				address.sendKeys("Chennai");
				Thread.sleep(2000);
				WebElement phoneno = driver.findElement(By.id("phoneno"));
				phoneno.sendKeys("9876543210");
				Thread.sleep(2000);
				WebElement button = driver.findElement(By.id("login"));
				button.click();
				Thread.sleep(2000);
				System.out.println(" Name : " + driver.findElement(By.id("pname")).getText());
				System.out.println(" Address : " + driver.findElement(By.id("res")).getText());

			}

}
