package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTests {
	
	public static WebDriver driver;
	public static Properties prop;

	public BaseTests() {
		try {
		
			prop = new Properties();
			
			String path = "C:\\Users\\tithi\\Desktop\\Software Testing\\Project_Amazon-BDD\\src\\test\\resources\\EnvironmentVariables\\TestData.properties";
			
			FileInputStream fis = new FileInputStream(path);
			
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\tithi\\Desktop\\Software Testing\\Project_Amazon-BDD\\src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS );
       
        driver.get(prop.getProperty("URL"));
      
	}
	

}
