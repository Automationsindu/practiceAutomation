package practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demoqa.com/browser-windows");
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		//String pg1= driver.getWindowHandle();
		//System.out.println("pg1 WH is "+ pg1);
		WebElement pg1_frame= driver.findElement(By.xpath("//div[@class='category-cards']/div[3]"));
		pg1_frame.click();
		WebElement pg2_frame=driver.findElement(By.xpath("//span[contains(@ class,'text')and text()='Browser Windows']"));
		pg2_frame.click();
		
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);

		Set<String> pg2_Child_WHs=driver.getWindowHandles();
		List<String > pg2_Child_WHsList=new ArrayList(pg2_Child_WHs);
		System.out.println(pg2_Child_WHsList.size());
		String PW_id1= pg2_Child_WHsList.get(0);
		System.out.println(PW_id1);
		String CW_id2= pg2_Child_WHsList.get(1);
		System.out.println(CW_id2);
		//WebElement text = driver.findElement(By.id("sampleHeading"));
        //System.out.println("Heading of child window is " + text.getText());
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(PW_id1);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
