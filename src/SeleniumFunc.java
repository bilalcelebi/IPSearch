
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFunc {

	WebDriver driver;
	
	
	public void LaunchBrowser(String ip) {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bilal\\Documents\\Java Libraries\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.ipsorgu.com/ip_sorgulama.php");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			SearchIP(ip);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public void SearchIP(String data) {
		
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
        	driver.findElement(By.id("ip")).clear();
        	driver.findElement(By.id("ip")).sendKeys(data);
        	driver.findElement(By.id("ip_sorgu_butonu")).click();
        	Thread.sleep(1000);
        	js.executeScript("window.scroll(0,700)");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
		
	}
	
	
}
