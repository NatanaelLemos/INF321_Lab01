package br.com.unicamp.inf321.models.bookstore;

import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

@GraphWalker(value = "random(edge_coverage(100))", start = "v_NotesListView")
public class BookstoreModel 
extends org.graphwalker.core.machine.ExecutionContext
implements br.com.unicamp.inf321.UserCase1_PesquisarProduto,
			br.com.unicamp.inf321.UserCase2_ManipularItensCarrinho,
			br.com.unicamp.inf321.UserCase3_EfetivarPedido,
			br.com.unicamp.inf321.UserCase4_RealizarPagamentoCartao {

	private AndroidDriver<WebElement> driver;
	private WebDriverWait wait;
	private static final String TEXT_VIEW_LOCATOR = "android.widget.TextView";
	private static final String LIST_VIEW_LOCATOR = "android.widget.ListView";
	private static final String EDIT_TEXT_LOCATOR = "android.widget.EditText";
	private static final String FIRST_NOTE_LOCATOR = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.ListView[1]/android.widget.TextView[1]";

	public BookstoreModel(AndroidDriver<WebElement> driver) {
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}
	
	
	@Override
	public void selecionarPagamentoPorCartao() {
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_MENU);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/title")));
		TouchAction touchAction = new TouchAction(driver);
    	touchAction.tap(895, 1655).perform();
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
	public void aprovar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Dados_enviados_ipo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Email_Enviado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preencherDados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Retorno_Exibido() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exibirRetorno() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pgto_cartao_selecionado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void End() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pagamento_sucesso() {
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
	public void selecionaPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaEnderecosEntrega() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionaModalidade() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inicio() {
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
	public void TelaInclusaoEndereco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forcaErroEndereco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incluirEndereco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaPagamentos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionaEndereco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaModalidadeEntregas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaCarrinhoCompras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TelaResultadoCompra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visualizar_carrinho() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decrementar_item() {
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
	public void incrementar_item() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Lista_de_produto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preencherPesquisa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Lista_de_produtos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pesquisa_preenchida() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pagina_inicial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Popup_de_erro() {
		// TODO Auto-generated method stub
		
	}

}
