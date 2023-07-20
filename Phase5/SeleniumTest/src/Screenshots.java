import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw.com/");
		
		//method 1
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./ScreenShots/demo.jpg");
		Files.copy(sourceFile, destFile1);
		System.out.println("Screenshot-1 taken successfully");
		Thread.sleep(3000);
		
		//method2
		String base64code =  driver.getScreenshotAs(OutputType.BASE64);
		byte[] bytarr =  Base64.getDecoder().decode(base64code);
		File destFile2 = new File("./ScreenShots/demo4.jpg");
		FileOutputStream fos = new FileOutputStream(destFile2);
		fos.write(bytarr);
		fos.close();
		System.out.println("Screenshot-2 taken successfully");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
