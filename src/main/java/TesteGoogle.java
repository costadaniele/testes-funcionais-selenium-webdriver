import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TesteGoogle {
	/* public static void main(String[] args) { */
	@Test
	public void teste() {
		// System.setProperty("webdriver.gecko.driver", "/User/usuário/Downloads/geckodriver.exe");

		// WebDriver driver = new InternetExplorerDriver();
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		// Dimensões da tela
		// driver.manage().window().setPosition(new Point(100, 100));
		// driver.manage().window().setSize(new Dimension(1200, 765));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		// Impressão do título na IDE
		// System.out.println(driver.getTitle());

		// (valor esperado), valor atual();
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
}
