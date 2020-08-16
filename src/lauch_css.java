import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class lauch_css {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1");
		//driver.findElement(By.cssSelector("input[id='Email'][name='Email']")).sendKeys("start");
		//driver.findElement(By.cssSelector("input[id='Passwd'][name='Passwd']")).sendKeys("end");
		//driver.findElement(By.cssSelector("input[id='signIn'][name='signIn']")).click();
		driver.findElement(By.cssSelector("input[name$='ail']")).sendKeys("Start");
		driver.findElement(By.cssSelector("input[name^='Pas']")).sendKeys("end");
		driver.findElement(By.cssSelector("input[name*='si']")).click();

	}

}
