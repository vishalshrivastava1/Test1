import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import com.opera.core.systems.scope.protos.PrefsProtos.Pref;


public class WebDriver_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		ProfilesIni Selenium = new ProfilesIni();
		FirefoxProfile Selenium = Pref.getProfile("Selenium");
		
		
		
	}

}
