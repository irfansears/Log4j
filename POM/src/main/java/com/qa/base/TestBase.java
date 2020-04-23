package com.qa.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger log=Logger.getLogger(TestBase.class.getName());;
//	=Logger.getLogger(TestBase.class.getName());;
	public static String methodName;
//	public  static EventFiringWebDriver e_driver;
//	public static WebEventListener eventListener;
	
	public  void initialization(){
		
		log.info("launching the browser ...");
		
//		String browserName = prop.getProperty("browser");
		
		/*if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		eventListener = new WebEventListener();
//		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));*/
		
	}
	
	public TestBase(){
		
//		try {
//			prop = new Properties();
//			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com"
//					+ "/qa/config/config.properties");
//			prop.load(ip);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
