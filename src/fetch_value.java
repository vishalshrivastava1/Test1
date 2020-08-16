import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class fetch_value {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1;
		str1="Enter GMO OnLine";
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.borland.com/gmopost/");
		String str=driver.findElement(By.xpath("html/body/form/div[1]/center/table/tbody/tr/td[1]/input")).getAttribute("value");
		System.out.println(str);
		
		if(str.equals(str1))
		{
			System.out.println("sucess");
		}
		
		else
		{
			System.out.println("fail");
		}
		

	}

}
