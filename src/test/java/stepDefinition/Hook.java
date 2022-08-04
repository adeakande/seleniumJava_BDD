package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BaseUtil;

public class Hook extends BaseUtil{
	private BaseUtil base;
	public Hook(BaseUtil base) {
		this.base = base;
	}

	@Before
	public void setup() {
		base.driver = library.Browsers.launchBrowser("chrome");
	}

	@After
	public void teardown() {
		base.driver.quit();
	}


}
