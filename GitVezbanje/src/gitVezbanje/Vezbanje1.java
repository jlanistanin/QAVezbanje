package gitVezbanje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vezbanje1 {
	

	public static void firstname() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\chromedriver");
		// WebDriver driver = new ChromeDriver();
		// zad 1.Launch a new Chrome browser
		// 2. Open https://www.ultimateqa.com/sample-application-lifecycle-sprint-1/
		// 3. Fill in the text box First name
		// 4. Click Submit
		// 5. Close the browser

		WebDriver driver = new ChromeDriver();
		String url = "https://www.ultimateqa.com/sample-application-lifecycle-sprint-1/";
		driver.get(url);
		
		driver.findElement(By.xpath("////*[@id=\"post-927\"]/div/form/input[1]")).sendKeys("Luckt");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"submitForm\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

	// Launch a new Chrome browser
//		2. Open https://www.ultimateqa.com/sample-application-lifecycle-sprint-2/
//			3. Fill in the text box First name
//			4. Fill in the text box Last name
//			4. Click Posalji
//			5. Close the browser
	public static void fillfirstAndLastName() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.ultimateqa.com/sample-application-lifecycle-sprint-2/";
		driver.get(url);
		Thread.sleep(3600);
		driver.findElement(By.xpath("//*[@id=\"post-932\"]/div/form/input[1]")).sendKeys(" John");
		Thread.sleep(3600);
		driver.findElement(By.xpath("//*[@id=\"post-932\"]/div/form/input[2]")).sendKeys("Johnson");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"post-932\"]/div/form/input[3]")).click();
		Thread.sleep(4000);
		driver.close();
	}

//		zad 3.
//		1. Launch a new Chrome browser
//		2. Open https://www.ultimateqa.com/sample-application-lifecycle-sprint-2/
//			3. Choose your gender
//			4. Fill in the text box First name
//			5. Fill in the text box Last name
//			6. Click Posalji
//			7. Close the browser
	public static void fillfirstNameLastNameAndGender() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.ultimateqa.com/sample-application-lifecycle-sprint-2/";
		driver.get(url);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"post-934\"]/div/form/input[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-934\"]/div/form/input[4]")).sendKeys("Eron");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"post-934\"]/div/form/input[5]")).sendKeys("Erickson");
		driver.findElement(By.xpath("//*[@id=\"post-932\"]/div/form/input[3]")).click();

		Thread.sleep(3000);
		driver.close();
	}

		
	}









