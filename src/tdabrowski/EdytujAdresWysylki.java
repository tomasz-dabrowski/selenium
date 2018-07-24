package tdabrowski;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdytujAdresWysylki {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			
		driver.get("https://adrem.jgora.pl/new/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Zaloguj siê'])")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Credentials.LOGIN);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Credentials.PASSWORD);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Edytuj'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='shipping_first_name']")).clear();
		driver.findElement(By.xpath("//input[@name='shipping_first_name']")).sendKeys(Credentials.SHIPPING_FIRST_NAME);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='shipping_last_name']")).clear();
		driver.findElement(By.xpath("//input[@name='shipping_last_name']")).sendKeys(Credentials.SHIPPING_LAST_NAME);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='shipping_company']")).clear();
		driver.findElement(By.xpath("//input[@name='shipping_company']")).sendKeys(Credentials.SHIPPING_COMPANY);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='shipping_address_1']")).clear();
		driver.findElement(By.xpath("//input[@name='shipping_address_1']")).sendKeys(Credentials.SHIPPING_ADDRESS_1);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='shipping_address_2']")).clear();
		driver.findElement(By.xpath("//input[@name='shipping_address_2']")).sendKeys(Credentials.SHIPPING_ADDRESS_2);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='shipping_city']")).clear();
		driver.findElement(By.xpath("//input[@name='shipping_city']")).sendKeys(Credentials.SHIPPING_CITY);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='shipping_postcode']")).clear();
		driver.findElement(By.xpath("//input[@name='shipping_postcode']")).sendKeys(Credentials.SHIPPING_POSTCODE);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//a[text()='Wyloguj'])")).click();
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("Test pass");
	}
}