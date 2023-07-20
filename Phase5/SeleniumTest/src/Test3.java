import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("http://www.facebook.com/");
		cd.findElement(By.cssSelector("input#pass"));
		Thread.sleep(3000);
		cd.findElement(By.cssSelector("input.inputtext"));
		Thread.sleep(3000);
		cd.findElement(By.cssSelector("input[name=email]"));
		Thread.sleep(3000);
		cd.quit();
	}
	
	public static void highlight(WebDriver cd, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) cd;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

}
