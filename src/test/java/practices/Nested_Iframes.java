package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nested_Iframes {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		int tot_frames= driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames are "+tot_frames);
		/*for(int i=0;i<tot_frames;i++)
		{
			driver.switchTo().frame(i);
			driver.switchTo().defaultContent();
			Thread.sleep(500);
			System.out.println(i);
		}*/
		WebElement parentF=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parentF);
		System.out.println("frames inside parent frame "+driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		System.out.println("frames inside parent's child[0] frame "+driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().parentFrame();
		System.out.println("Going out from child to parent "+driver.findElements(By.tagName("iframe")).size());
		
		//System.out.println("Going out from  child to default web page "+driver.findElements(By.tagName("iframe")).size());
		WebElement childF= driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childF);
		System.out.println("From parent using child frame webElement coming back to child");
		System.out.println("frames inside child frame "+driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().defaultContent();
		
		WebElement f1= driver.findElement(By.xpath("//div[@id='adplus-anchor']//iframe[@title='3rd party ad content']"));
		driver.switchTo().frame(f1);
		System.out.println("frames inside frame1 "+driver.findElements(By.tagName("iframe")).size());
		int frame1= driver.findElements(By.tagName("iframe")).size();
		for(int i=0;i<frame1;i++)
		
		{
		driver.switchTo().frame(i);
		
		System.out.println(" inside frame1's frame[] "+ i +"is "+driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().parentFrame();
		
		}
		
	}
}
