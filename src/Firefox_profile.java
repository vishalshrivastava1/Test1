import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox_profile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("Email")).sendKeys("start");
		driver.findElement(By.name("Passwd")).sendKeys("end");
		driver.findElement(By.name("signIn")).click();
		
	

	}

}
