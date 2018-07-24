package tdabrowski;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DodajDoKoszyka {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			
		driver.get("https://adrem.jgora.pl/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Ksiêgarnia Karkonoska'])")).click();
		driver.findElement(By.cssSelector("img[alt='Ksi¹¿ki']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[h3[contains(text(),'Anatomia Nadcz³owieka')]])")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Do koszyka']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Zobacz koszyk'])")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='PrzejdŸ do kasy'])")).click();
		Thread.sleep(1000);
		
		driver.close();
		System.out.println("Test pass");
	}
}