package tdabrowski;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DodajAdministratora {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			
		driver.get("https://design.media.pl/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://design.media.pl/administrator/index.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Credentials.LOGIN2);
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(Credentials.PASSWORD2);
		driver.findElement(By.xpath("(//div[@class='button1'])")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[span[text()='U¿ytkownicy']])")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//li[@id='toolbar-new'])")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='jform_name']")).sendKeys(Credentials.NAME);
		driver.findElement(By.xpath("//input[@id='jform_username']")).sendKeys(Credentials.USERNAME);
		driver.findElement(By.xpath("//input[@id='jform_password']")).sendKeys(Credentials.PASSWORD3);
		driver.findElement(By.xpath("//input[@id='jform_password2']")).sendKeys(Credentials.PASSWORD3);
		driver.findElement(By.xpath("//input[@id='jform_email']")).sendKeys(Credentials.EMAIL);
		driver.findElement(By.xpath("//input[@id='1group_1']")).click();
		driver.findElement(By.xpath("//input[@id='1group_6']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='jform_params_admin_style']")).sendKeys("Bluestork - Default");
		driver.findElement(By.xpath("//select[@id='jform_params_admin_language']")).sendKeys("Polish (PL)");
		driver.findElement(By.xpath("//select[@id='jform_params_language']")).sendKeys("Polish (PL)");
		driver.findElement(By.xpath("//select[@id='jform_params_editor']")).sendKeys("Edytor - TinyMCE");
		driver.findElement(By.xpath("//select[@id='jform_params_helpsite']")).sendKeys("English (GB) - Joomla help wiki");
		driver.findElement(By.xpath("//select[@id='jform_params_timezone']")).sendKeys("Warsaw");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//li[@id='toolbar-save'])")).click();
		Thread.sleep(1000);
		
		driver.get("http://design.media.pl/administrator/index.php");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Wyloguj'])")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Credentials.USERNAME);
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(Credentials.PASSWORD3);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='button1'])")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()='Wyloguj'])")).click();
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("Test pass");
	}
}