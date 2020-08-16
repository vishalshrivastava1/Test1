import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.seleniumemulation.ClickAt;


public class launch_app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail");
		driver.findElement(By.id("Email")).sendKeys("selenium.vishal");
		driver.findElement(By.id("Passwd")).sendKeys("Oracle@123");
		driver.findElement(By.id("signIn")).click();
		//driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
		//driver.findElement(By.linkText("https://mail.google.com/mail/u/0/#starred")).click();
		//driver.findElement(By.xpath(".//*[@id=':4d']/div/div")).click();
		  driver.findElement(By.xpath("//div[@id=':4d']/div/div")).click();
	}

}
