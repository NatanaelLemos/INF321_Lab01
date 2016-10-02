package br.com.unicamp.inf321.models.bookstore;

import static org.assertj.core.api.StrictAssertions.assertThat;

import java.util.Random;

import org.assertj.core.api.AssertDelegateTarget;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.unicamp.inf321.BookStore;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

@GraphWalker(value = "random(edge_coverage(100))", start = "Pagina_inicial")
public class BookstoreModel extends org.graphwalker.core.machine.ExecutionContext implements BookStore{

	private AndroidDriver<WebElement> driver;
	private WebDriverWait wait;
	private static final String TEXT_VIEW_LOCATOR = "android.widget.TextView";
	private static final String LIST_VIEW_LOCATOR = "android.widget.ListView";
	private static final String EDIT_TEXT_LOCATOR = "android.widget.EditText";
	private static final String FIRST_NOTE_LOCATOR = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.ListView[1]/android.widget.TextView[1]";
	
	public BookstoreModel(){
	}
	
	public BookstoreModel(AndroidDriver<WebElement> driver) {
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	@Override
	public void iniciar() {
		driver.launchApp();		
	}

	@Override
	public void Pagina_inicial() {		
		assertThat(true);
	}

	@Override
	public void preencherPesquisa() {
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1670, 341).perform();
    	
		TouchAction touchAction2 = new TouchAction(driver);
    	touchAction2.tap(212, 353).perform();
    	assertThat(true);
	}

	@Override
	public void Popup_de_erro() {
		
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(341, 1670).perform();
    	
		TouchAction touchAction2 = new TouchAction(driver);
    	touchAction2.tap(353, 212).perform();
    	assertThat(true);
	}

	@Override
	public void Pesquisa_preenchida() {
    	assertThat(true);		
	}

	@Override
	public void Lista_de_produtos() {
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1044, 1688).perform();
    	assertThat(true);
	}
	
	@Override
	public void visualizar_carrinho() {
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(643, 895).perform();
		assertThat(true);
	}

	@Override
	public void TelaEnderecosEntrega() {
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(1480, 899).perform();
		assertThat(true);
	}

	@Override
	public void selecionaEndereco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Dados_Preenchidos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviarRetorno() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarCompra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SepararProduto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EmSeparacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementar_item() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preencherDados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementar_item() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pgto_cartao_selecionado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pagamento_sucesso() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaModalidadeEntregas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Carrinho_de_compras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionar_ao_carrinho() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionaModalidade() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aprovar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Dados_enviados_ipo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Email_Enviado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaInclusaoEndereco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forcaErroEndereco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incluirEndereco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ExibirRetorno() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviarEmail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviarDados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaResultadoCompra() {
		// TODO Auto-generated method stub
		
	}

}
