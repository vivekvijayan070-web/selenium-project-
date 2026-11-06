package Base_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Kerala_login_page_pkg.kerala_login_class;

public class base_class {
	public static WebDriver driver;
	public kerala_login_class kerala_login_classobj;

	@BeforeTest
	public void browsersetup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void objectmeth() {
	kerala_login_classobj = new kerala_login_class(driver);
	}
}
