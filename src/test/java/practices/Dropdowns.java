package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	
		//WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
		/*
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.id("google_esf"));
		//driver.switchTo().frame("google_esf");
		WebElement drop= driver.findElement(By.xpath("//div[@class='information closable']//following-sibling::p/select"));
		
		//WebElement drop= driver.findElement(By.tagName("select"));
		////select[@fdprocessedid='qdjghr']
		Select select= new Select(drop);
		select.selectByVisibleText("Algeria");
		select.selectByIndex(0);
		select.selectByValue("ALA");
		////div[@class='information closable']//following-sibling::p/select
		
// iteratng all options
		List<WebElement> allOptions= select.getOptions();
		
		System.out.println("The total number of country in the drop down is  "+ allOptions.size());
		for(WebElement eachOption:allOptions)
		{
			//System.out.println("Each option is"+eachOption.getText());
			if(eachOption.getText().equalsIgnoreCase("Vanuatu"))
			{
				eachOption.click();
				break;
			}
		*/
		
// without select class
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='UUbT9'][1]//div[@class='erkvQe']//ul/li"));
		
		System.out.println(list.size());
		for(WebElement oneoption:list)
		{
			System.out.println( oneoption.getText() );
			if(oneoption.getText().equals("selenium webdriver"))
			{
				oneoption.click();
				break;
			}
		}
		
		
		
	}

}
