import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class launch_name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ProfilesIni prof  = new ProfilesIni();
	        FirefoxProfile p = prof.getProfile("week");
	        FirefoxDriver driver = new FirefoxDriver(p);
	       

	}

}
