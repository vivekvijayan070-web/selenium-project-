package Kerala_login_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_pkg.base_class;

public class kerela_login_test_class extends base_class {

	@Test(priority=1)
	public void titleverification() {
		kerala_login_classobj.titlemth();
		String Actualtitle = kerala_login_classobj.titlemth();
		Assert.assertEquals(Actualtitle, "keralaproprty");
	}

	@Test(priority=2)
	public void methodvalidation() {
		kerala_login_classobj.loginmth("username", "password");
	}
}