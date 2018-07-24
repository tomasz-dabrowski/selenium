package tdabrowski;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SzukajPrzetargDrukuj {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.get("https://www.sobotka.pl/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='head-search-input']")).sendKeys("przetarg na działki w przemiłowie");
		driver.findElement(By.xpath("//input[@class='head-search-button']")).click();
		driver.findElement(By.xpath("(//a[text()='II przetarg na działki w Przemiłowie'])")).click();
		//driver.findElement(By.id("listenButton1")).click();
		driver.findElement(By.xpath("(//a[text()='Drukuj'])")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("Test pass");
	}
}