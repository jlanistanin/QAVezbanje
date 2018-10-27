package gitVezbanje;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Domaci4_5_6 {
//	Zadatak4:
//		1. Launch new Browser
//		2. Open “http://toolsqa.wpengine.com/automation-practice-form/”
//		3. Select ‘Continents’ Drop down ( Use Id to identify the element )
//		4. Select option ‘Europe’ (Use selectByIndex)
//		5. Select option ‘Africa’ now (Use selectByVisibleText)
//		6. Print all the options for the selected drop down and select one option of your choice
//		7. Close the browser
//
//		Zadatak5:
//
//		1. Launch new Browser
//		2. Open “http://toolsqa.wpengine.com/automation-practice-form/”
//		3. Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
//		4. Select option ‘Browser Commands’  and then deselect it (Use   and deselectByIndex)
//		5. Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
//		6. Print and select all the options for the selected Multiple selection list.
//		7. Deselect all options
//		8. Close the browser
//		toolsqa.com
//		Demo Form for practicing Selenium Automation
//		Automation Practice Form - A basic form with all the different type of elements to practice automation .
//		Zadatak6:
//		1. Launch new Browser
//		2. Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
//		3. Get the text from cell ‘Dubai’ with using relative path and print it on the console
//		4. Click on the link ‘Detail’ of the first row and last column and print "Successfully clicked" message
//		5. Close the browser

	public static void zadatak4() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\chromedriver");
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
		driver.findElement(By.id("\"continents\"")).click();
		Select continents = new Select(driver.findElement(By.xpath("//label[contains(text(),'Continents')]")));
		continents.selectByIndex(1);
		continents.selectByVisibleText("Africa");
		List<WebElement> sizeCon = continents.getOptions();
		int listSize = sizeCon.size();
		for (int i = 0; i < listSize; i++) {

			String sValue = continents.getOptions().get(i).getText();
			System.out.println(sValue);

			if (sValue.equals("Australia")) {
				continents.selectByIndex(i);

			}
		}

		driver.close();

	}

	public static void zadatak5() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\chromedriver");
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
		Select SeleniumCommands = new Select(driver.findElement(By.name("selenium_commands")));
		SeleniumCommands.selectByIndex(0);
		Select BrowserCommands = new Select(driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")));
		BrowserCommands.selectByIndex(0);
		BrowserCommands.deselectByIndex(0);
		Select NavigationCommands = new Select(
				driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[2]")));
		NavigationCommands.selectByVisibleText("Navigation Commands");
		NavigationCommands.deselectByVisibleText("Navigation Commands");
		List<WebElement> sizeCount = SeleniumCommands.getOptions();
		int listSize = sizeCount.size();
		for (int i = 0; i < listSize; i++) {
			String sValue = SeleniumCommands.getOptions().get(i).getText();
			System.out.println(sValue);
			SeleniumCommands.selectByIndex(i);

		}
		SeleniumCommands.deselectAll();
		driver.close();
	}

	public static void zadatak6() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\chromedriver");
		String url = "http://toolsqa.wpengine.com/automation-practice-table/";
		driver.get(url);
		WebElement Dubai = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]"));
		System.out.println(Dubai.getText());
WebElement Details = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[6]/a"));
 Details.click();
System.out.println("Successfully clicked");
driver.close();
	}

}