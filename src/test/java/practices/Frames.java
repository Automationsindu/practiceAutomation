package practices;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverWait wait;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 //switch frame by name/Id |Index|Webelement
		driver.switchTo().frame("courses-iframe");
		WebElement all_course=driver.findElement(By.xpath("//div[@id='courses-block']//div/a[contains(@href,'get-access-to-all-courses')]"));
		 wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOf(all_course));
		 System.out.println(driver.getWindowHandle());
		 all_course.click();
		 System.out.println(driver.getWindowHandle());
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='opentab']")).click();
		 Set<String> Widss=driver.getWindowHandles();
		 List<String> WidssList= new ArrayList(Widss);
		 System.out.println(WidssList.size());
		 System.out.println(WidssList.get(0));
		 String parentId=WidssList.get(0);
		 String childId=WidssList.get(1);
		 System.out.println(WidssList.get(1));
		 System.out.println(driver.getWindowHandle());
		 //switch frame by index by forloop
		 int fsize= driver.findElements(By.tagName("iframe")).size();
		 for(int i=0;i<fsize;i++)
		 {
			 driver.switchTo().frame(i);
			 driver.findElement(By.xpath("//div[@id='courses-block']//div/a[contains(@href,'get-access-to-all-courses')]")).click();
			 System.out.println("The index is "+i);
				
		 }
		 
		 
		 int pcframe=driver.findElements(By.tagName("iframe")).size();
		 System.out.println("Traverse from parent frame to child frame "+pcframe);
		 driver.switchTo().frame(0);
		 System.out.println("checking any child presence for the child[0] frame "+driver.findElements(By.tagName("iframe")).size());
		 System.out.println("no childframe for the child[0]");
		 driver.switchTo().parentFrame();
		 System.out.println("moved from child to parent and checking the number of frame "+ driver.findElements(By.tagName("iframe")).size());
		 driver.switchTo().frame(1);
		 System.out.println("checking any child presence for the child[1] frame "+driver.findElements(By.tagName("iframe")).size());
	}

}
