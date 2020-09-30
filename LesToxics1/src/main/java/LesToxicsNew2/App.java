package LesToxicsNew2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Les Toxics!
 *
 */
public class App 
{
    private static final Paths Driver = null;

	public static void main( String[] args )
    {
        System.out.println("Les Toxics");
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Driver" + File.separator;
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");  //Seteando la propiedade del .exe
        WebDriver driver = new ChromeDriver(); //Inicializando el driver
      Driver.get("https://lestoxics.catalog.to/s/les-toxics/les-toxics/3bln");
	}
}