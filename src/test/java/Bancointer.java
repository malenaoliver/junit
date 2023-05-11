import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {
	
	
	
    WebDriver driver;
	@Before
	public void setUp() throws Exception {
	
//codigo que indica o navegador
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
//comando pra chamar meu driver no before
        driver = new ChromeDriver();
	  driver.get("https://www.bancointer.com.br/");
	  //comando para maximizar tela
	  driver.manage().window().maximize();
	  // comando para interagir com o elemento
	  driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
	  
        
        
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
