package opencartUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public Logger logger;
	public Properties prop;
	public File file;
	public FileInputStream inputStream;

	public void loadproperty() throws IOException {
		prop = new Properties();
		file = new File("prop");
		inputStream = new FileInputStream(file);
		prop.load(inputStream);
	}

	public String getProperty(String x) {
		return prop.getProperty(x);
	}

	@Before
	public void broeserFactory() {
		WebDriverManager.chromedriver().setup();
		// logger = LogManager.getFormatterLogger(this.getClass());
		// ChromeOptions options = new ChromeOptions();
		// driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/opencart/upload/index.php");
	}

//	@After
//	public void tearDown(Scenario scenario) {
//		System.out.println("Scenario status ======>" + scenario.getStatus());
//		if (scenario.isFailed()) {
//			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot, "image/png", scenario.getName());
//		}
//		driver.quit();
//	}

	@After
	public void teardown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			System.out.println("Scenario status ======>" + scenario.getStatus());
			String date = new SimpleDateFormat("MM-dd-yyyy h-m-s").format(new Date());
			String derectory = System.getProperty("user.dir") + "/Screenshot/" + scenario.getName() + date + ".png";
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(derectory));
		}
		driver.close();
		driver.quit();
		System.out.println(" *****Test Complete, Browser Closed***** ");
	}

}
