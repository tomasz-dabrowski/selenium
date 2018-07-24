package tdabrowski;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SzukajWydarzenieGaleria {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.get("https://www.sobotka.pl/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Aktualności'])")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Kultura i Nauka'])")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Centrum Kultury')])")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='04-IMG_7850']")).click();
		Thread.sleep(2000);
		for (int i = 0; i < 8; i++ ) {
			driver.findElement(By.xpath("//a[@id='fancybox-right']")).click();
			Thread.sleep(2000);
		}
		
		driver.findElement(By.xpath("//a[@id='fancybox-close']")).click();
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("Test pass");
		
	}
}