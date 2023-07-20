import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadTime {


			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				 
				driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
				
				Instant startTime = Instant.now();
				System.out.println(startTime.toString());
				
				driver.get("https://www.amazon.com/");
				
				Instant endTime = Instant.now();
				System.out.println(endTime.toString());
				
				Duration duration = Duration.between(startTime, endTime);
				System.out.println("Page Load Duration Time is : " + ((duration.toMillis())/1000) + " Seconds");
				Thread.sleep(3000);
				driver.quit();
		}

}
