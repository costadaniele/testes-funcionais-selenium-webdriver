import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
		/*public static void main(String[] args) {*/
		@Test
		public void teste() {
		// System.setProperty("webdriver.gecko.driver", "/User/usuário/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		// Impressão do título na IDE
		//System.out.println(driver.getTitle());
		
		//(valor esperado), valor atual();
		Assert.assertEquals("Google", driver.getTitle() );
	}
}
