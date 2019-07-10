package Telas;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TelaNome {
	

	private AndroidDriver<MobileElement> driver;

	 
    public TelaNome(AndroidDriver<MobileElement> driver) {
      this.driver = driver;
    }
	
	
	/********************************************************************
	* @category Digitar nome do usuario
	********************************************************************/
		 public TelaNome Nome(String nome) {
			 driver.findElement(By.id("owner")).sendKeys(nome);
			 return new TelaNome(driver);
		}

	/********************************************************************
	* @category Clicar no botao para confirmar acesso
	********************************************************************/
		public TelaNome Confirmar() {
			 driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
			 return new TelaNome(driver);
		}

}
