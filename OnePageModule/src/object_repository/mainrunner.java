package object_repository;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class mainrunner {

	
		
		@Test
		public void login() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kishor janwade\\Desktop\\Yogesh khot\\chromedriver_win32\\chromedriver.exe");	
			WebDriver driver=new ChromeDriver();
			driver.get("https://money.rediff.com/index.html");
			
			Lauch_rediff rediff= new Lauch_rediff(driver);
			PageFactory.initElements(driver, rediff);
			rediff.clickNext();
			
			rediff.entercrenditials("yogeshkhot2324@gmail.com", "Yogesh2324@");
			rediff.submit();
			
			System.out.println("End of code");
			
		}
	

}
