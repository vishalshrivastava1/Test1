

public class launch_xpath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://gmail.com/");
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("start");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("end");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		

	}

}
