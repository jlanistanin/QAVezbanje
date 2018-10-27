package gitVezbanje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainVezbanje23102018 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
Vezbanje23102018.FiilTheForm(driver);
Vezbanje23102018.FiilTheFormWithCaptcha(driver);
Vezbanje23102018.fillFirstAndLastName(driver);
Vezbanje23102018.fillFirstLastNameAndGender(driver);
Vezbanje23102018.logIn(driver);
Vezbanje23102018.logInWithIncorrectPassword(driver);

	}

}
