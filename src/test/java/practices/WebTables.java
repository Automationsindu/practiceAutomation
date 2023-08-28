package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(5000);
		
		
		List<WebElement> list= driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(list.size());
		for(WebElement eachrow:list)
		{
			
			//System.out.println(eachrow.getText());
		}
		
	//no. of col
		List<WebElement> tot_col= driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("The total number of row is "+tot_col.size());
		
	//no. of row
		List<WebElement> tot_row= driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("The total number of row is "+ tot_row.size());
		
	//targetting particular row.
		String targetRow= driver.findElement(By.xpath("//table/tbody/tr[8]")).getText();
		
		System.out.println("The targeted row is " + targetRow);
	//targetting particular row and its column
		String targetCol= driver.findElement(By.xpath("//table/tbody/tr[8]/td[4]")).getText();
		
		System.out.println("The targeted col is " + targetCol );
	
	//finding the sum of one col
		float count=0;
		List <WebElement> allCol= driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for(int i=1;i<allCol.size();i++)
			//for(WebElement eachCol:allCol)
			{
			String svalue= allCol.get(i).getText();
				
				System.out.println(svalue);
				
				float ivalue=Float.parseFloat(svalue);
				
				count=count+ivalue;
				
			}
		System.out.println("The sum of value of col 3 in all row is" +count);
		String txtVal = null;
		for(int r=1;r<tot_row.size();r++)
		 {
			System.out.print("|");
			for(int c=1;c<=tot_col.size();c++)
			{
				txtVal = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(txtVal+"|"); 
			}
			System.out.println();
		}
		
		
	}
	
	//


		
}
