package Constante;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import Dados.Capabilities;
import Dados.Dados;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetCapabilities {
	
	private static AndroidDriver<MobileElement> driver;
	
	public static void SetUpCapabilities() {
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("udid", Capabilities.UDID);
	capabilities.setCapability("deviceName", Capabilities.DEVICE_NAME);
	capabilities.setCapability("platformName", Capabilities.PLATFORM_NAME);
	capabilities.setCapability("platformVersion", Capabilities.PLATFORM_VERSION);
	capabilities.setCapability("automationName", Capabilities.AUTOMATION_NAME);
	//capabilities.setCapability( "appPackage", "com.android.chrome" );
	//capabilities.setCapability("bundleId", "com.android.chrome");
	capabilities.setCapability("browserName", Capabilities.BROWSER_NAME);
	//Instancia o driver do Android apontando para o ip do servidor Appium e
	//passando as configuracoes defindas acima
	//driver = new AndroidDriver(new URL("http://127.0.0.1:8001/wd/hub"),capabilities);
	//return driver;
	//Setando local do chromedriver
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	//Instanciando o Appium Driver
	
	try {
		driver = new AndroidDriver<MobileElement>(new URL(Dados.HUB), capabilities);

	} catch (MalformedURLException e) {
		System.out.println(e.getMessage());
	}

	//Abrindo URL no Chrome Browser
	driver.get(Dados.URL);
	
	}
	
}
