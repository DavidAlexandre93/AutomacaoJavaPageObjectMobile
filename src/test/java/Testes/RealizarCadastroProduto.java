package Testes;

import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Constante.ChamadaMassa;
import Constante.ScreenShotCapture;
import Constante.SetCapabilities;
import Funcoes.Utils;
import Telas.TelaCadastroProdutos;
import Telas.TelaNome;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class RealizarCadastroProduto {
	
private AndroidDriver<MobileElement> driver;
	
	ChamadaMassa massaDados = new ChamadaMassa();
	//ScreenShotCapture telaScreen = new ScreenShotCapture();
	
	@Before
	public void IniciarBrowser() {
		SetCapabilities.SetUpCapabilities();
	}
	
	@Test
	public void CadastroProdutos() {
		
			
		try {
			
			JSONObject obj = massaDados.dadosJson();
			TelaCadastroProdutos produto = new TelaCadastroProdutos(driver);
			TelaNome nome = new TelaNome(driver);
			
		ScreenShotCapture.screenShot();
		nome.Nome((String)obj.get("nome"));
		ScreenShotCapture.screenShot();
		nome.Confirmar();
		ScreenShotCapture.screenShot();
		produto.NovoProduto();
		ScreenShotCapture.screenShot();
		produto.NomeProduto((String)obj.get("produto"));
		ScreenShotCapture.screenShot();
		produto.Preco((String)obj.get("valor"));
		ScreenShotCapture.screenShot();
		produto.TocarData();
		ScreenShotCapture.screenShot();
		produto.SelecionarData();
		ScreenShotCapture.screenShot();
		produto.Salvar();
		ScreenShotCapture.screenShot();
		Utils.WaitElement();
		Utils.AlertOK();
		Utils.WaitElement();
		ScreenShotCapture.screenShot();
		produto.VerificarProdutoCadastrado();
		ScreenShotCapture.arquivosDir();
		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	
	}
	
	@After
	public void FinalizarExecucao() {
		driver.quit();
	}
	

}
