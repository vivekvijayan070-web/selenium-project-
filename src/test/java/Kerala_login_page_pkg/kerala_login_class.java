package Kerala_login_page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kerala_login_class {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"ulogin\"]")
	WebElement username;
	@FindBy(xpath = " //*[@id=\"upass\"]")
	WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"] ")
	WebElement loginbutton;

	public kerala_login_class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String titlemth() {
		String title = driver.getTitle();
		return title;
	}

	public void loginmth(String un, String pw) {
		username.sendKeys("abcdef");
		password.sendKeys("12345");
		loginbutton.click();
	}

}
