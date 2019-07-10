package Funcoes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Utils {
	
	private static WebDriver driver;
	 
	 public Utils(WebDriver driver) {
	   Utils.driver = driver;
	 }

/********************************************************************
 * @category Clicar em Ok no pop-up
********************************************************************/
 public static void AlertOK() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
 }
 
 /********************************************************************
  * @category Teste parado por determinado tempo setado
 ********************************************************************/
 public static void WaitElement() throws InterruptedException {
	 Thread.sleep(5 * 1000);
 }
}
