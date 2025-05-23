package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ShoppingPage;
import utilities.Logs;
import utilities.WebDriverProvider;

public class ShoppingStepDefinitions {

    private final ShoppingPage shoppingPage = new ShoppingPage();

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("verifico la UI de la interfaz de shopping")
    public void verificoLaUIDeLaInterfazDeShopping() {
        Logs.info("verificar UI shopping");
        shoppingPage.verifyPage();
    }

    @When("agrego todos los items al carrito de compra")
    public void addToCart() {
        Logs.info("agregar los items al carrito");
        shoppingPage.addToCart();
    }

    @And("clic en finalizado")
    public void clicEnFinalizado() {

    }

    @Then("se genera la orden de compra")
    public void seGeneraLaOrdenDeCompra() {
    }
}
