package Telas;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TelaCadastroProdutos {
	
	private AndroidDriver<MobileElement> driver;

	 
    public TelaCadastroProdutos(AndroidDriver<MobileElement> driver) {
      this.driver = driver;
    }
    
    
    /********************************************************************
    * @category Clicar no botao para cadastrar novo produto
    ********************************************************************/
        public TelaCadastroProdutos NovoProduto() {
          driver.findElement(By.linkText("Novo Produto")).click();
          return this;
        }

    /********************************************************************
    * @category Digitar o nome do produto para cadastro
    ********************************************************************/
        public TelaCadastroProdutos NomeProduto(String produto) {
          driver.findElement(By.id("campo1")).sendKeys(produto);
          return this;
        }

    /********************************************************************
    * @category Digitar o preco do produto digitado
    *********************************************************************/
        public TelaCadastroProdutos Preco(String preco) {
            driver.findElement(By.name("price")).sendKeys(preco);
            return this;
          }
       
    /********************************************************************
    * @category Clicar no campo do calendario
    ********************************************************************/    
        public TelaCadastroProdutos TocarData() {
            driver.findElement(By.id("campo3")).click();
            return this;
          }
        
    /********************************************************************
    * @category Selecionar data no calendario
    * ********************************************************************/    
        public TelaCadastroProdutos SelecionarData() {
            driver.findElement(By.cssSelector("td[class='day'")).click();
            return this;
          }
        
    /********************************************************************
    * @category Clicar no botao para salvar produto
    ********************************************************************/    
        public TelaCadastroProdutos Salvar() {
    		 driver.findElement(By.cssSelector("button[type='submit']")).click();
            return this;
          }
        
        public TelaCadastroProdutos VerificarProdutoCadastrado() {
    		 driver.findElement(By.cssSelector("tr[class='ng-scope']")).getText().equals("Iphone X");
           return this;
         }
        

}
