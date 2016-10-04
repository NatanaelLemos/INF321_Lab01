package br.com.unicamp.inf321.models.bookstore;

import static org.assertj.core.api.StrictAssertions.assertThat;

import java.util.Random;

import org.assertj.core.api.AssertDelegateTarget;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.unicamp.inf321.BookStore;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

@GraphWalker(value = "random(edge_coverage(100))", start = "Pagina_inicial")
public class BookstoreModel extends org.graphwalker.core.machine.ExecutionContext implements BookStore {

	private AndroidDriver<WebElement> driver;
	private WebDriverWait wait;
	private static final String TEXT_VIEW_LOCATOR = "android.widget.TextView";
	private static final String LIST_VIEW_LOCATOR = "android.widget.ListView";
	private static final String EDIT_TEXT_LOCATOR = "android.widget.EditText";
	private static final String FIRST_NOTE_LOCATOR = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.ListView[1]/android.widget.TextView[1]";

	public BookstoreModel() {
	}

	public BookstoreModel(AndroidDriver<WebElement> driver) {
		super();
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	@Override
	public void iniciar() {
		driver.launchApp();
		wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
	}

	@Override
	public void Pagina_inicial() {
		wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
	}

	@Override
	public void preencherPesquisa() {
	}

	@Override
	public void pesquisa() {
	}

	@Override
	public void Popup_de_erro() {
	}

	@Override
	public void Pesquisa_preenchida() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			driver.tap(1, 240, 990, 100);
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void Lista_de_produtos() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			driver.tap(1, 1230, 909, 100);
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void voltar() {
	}

	@Override
	public void visualizar_carrinho() {
	}

	@Override
	public void Carrinho_de_compras() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			driver.tap(1, 350, 880, 100);
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void iniciarCompra() {

	}

	@Override
	public void TelaEnderecosEntrega() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			new TouchAction(driver).press(981, 1060).waitAction(2000).moveTo(981, 96).release().perform().waitAction();
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void selecionaModalidade() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			driver.tap(1, 1620, 545, 100);
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void TelaLogin() {
	}

	@Override
	public void selecionaEndereco() {
	}

	@Override
	public void TelaModalidadeEntregas() {
	}

	@Override
	public void Pgto_cartao_selecionado() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			driver.tap(1, 200, 760, 100);
			Thread.sleep(500);
		} catch (Exception ex) {
		}

	}

	@Override
	public void preencherDados() {
	}

	@Override
	public void Dados_Preenchidos() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			new TouchAction(driver).press(981, 1060).waitAction(2000).moveTo(981, 96).release().perform().waitAction();
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void Dados_enviados_ipo() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			driver.tap(1, 270, 440, 100);
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void Pagamento_sucesso() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			driver.tap(1, 1495, 790, 100);
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void Email_Enviado() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Image")));
			driver.tap(1, 830, 807, 100);
			Thread.sleep(500);
		} catch (Exception ex) {
		}
	}

	@Override
	public void enviarDados() {
	}

	@Override
	public void enviarRetorno() {
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
	public void incrementar_item() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void adicionar_ao_carrinho() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aprovar() {
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
	public void TelaResultadoCompra() {
		// TODO Auto-generated method stub

	}

}
