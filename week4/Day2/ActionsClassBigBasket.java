package week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassBigBasket {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//*[name()='svg' and @class='CategoryMenu___StyledArrow"
				+ "Down-sc-d3svbp-3 iwTeGC']//*[local-name()='path' and @clip-rule='evenodd'])[2]")).click();
	    Actions act = new Actions(driver);
	    Thread.sleep(3000);
	    act.moveToElement(driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"))).perform();
	    Thread.sleep(3000);
	   act.moveToElement(driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"))).perform();
	   Thread.sleep(3000);
	   act.moveToElement(driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).click().perform();
	   Thread.sleep(3000);
	   act.moveToElement(driver.findElement(By.xpath("(//input[@placeholder='Search here'])"))).click().perform();
	   driver.findElement(By.xpath("(//input[@placeholder='Search here'])")).sendKeys("bb Royal");
	   Thread.sleep(3000);
	   act.moveToElement(driver.findElement(By.xpath("//input[@id='i-BBRoyal']"))).click().perform();
	   Thread.sleep(3000);
	   act.moveToElement(driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"))).click().perform();
	   
	   //Set
	   Set<String> WindowHandles = driver.getWindowHandles();
	   System.out.println(WindowHandles);
	  
	   //change Set into List
	   List<String> WindowHandles1 = new ArrayList<String>(WindowHandles);
	   driver.switchTo().window(WindowHandles1.get(1));
	   String Bothtitle = driver.getTitle();
	   System.out.println(Bothtitle);
	   
	   act.moveToElement(driver.findElement(By.xpath("(//div[@class='flex flex-col items-start justify-start w-full p-2.5'])[5]"))).click().perform();
	   String title = driver.getTitle();
	   System.out.println(title);
	   WebElement Price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']"));
	   System.out.println(Price.getText());
	   Thread.sleep(3000);
	   driver.close();
	   driver.switchTo().window(WindowHandles1.get(0));
	   Thread.sleep(3000);
	   driver.close();
	}

}
