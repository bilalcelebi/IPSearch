import java.util.Scanner;
import java.util.regex.Matcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) {
		
		SeleniumFunc search = new SeleniumFunc();
		IPProtocol protocol = new IPProtocol();
		System.out.println("Bir IP Adresi Giriniz : ");
		Scanner scan = new Scanner(System.in);
		String ip = new String(scan.next(protocol.protocol));
		Matcher match = protocol.protocol.matcher(ip);
		
		boolean durum = protocol.Controlling(match);
		if(durum == true) {
			
			System.out.println("Yükleniyor...");
			search.LaunchBrowser(ip);
		}
		else
			System.out.println("Geçersiz IP Adresi");
		
		
	}
	
	
	

}
