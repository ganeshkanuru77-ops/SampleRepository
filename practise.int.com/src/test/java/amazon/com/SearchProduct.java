package amazon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchProduct {

	WebDriver driver;
	
	@Parameters("browser") 
	@Test(dataProvider="darling")
	public void search(String data,String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
	}
	driver.get("https://www.amazon.in/ref=cs_503_link/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(data);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
}
	
	@DataProvider(name="darling")
	public Object[][] dataTable() {
		 Object[][] dataTable= new Object[3][1];
		 dataTable[0][0]= "iphone";
		 dataTable[1][0]= "glasses";
		 dataTable[2][0]= "shoes";
		
		return dataTable;
	}

}
