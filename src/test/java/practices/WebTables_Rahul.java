package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables_Rahul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//total rows	
		List<WebElement> tot_row=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println("Total rows is "+ tot_row.size());
	//total cols	
		List<WebElement> tot_col=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		System.out.println("Total col is "+ tot_col.size());
		
		
		String cd=null;
		
		for(int r=2;r<tot_row.size();r++)
		{
			System.out.print("|");
			for (int c=1;c<=tot_col.size();c++)
			{
				 cd= driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+r+"]/td["+c+"]")).getText();			
				 System.out.print(cd + "|");
			}
		System.out.println();
		}
		

	}
	
}


