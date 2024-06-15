package week3.Day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
		

		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration, Seconds(30)); 
			driver.get("https://www.ajio.com/");
			driver.findElement(By.name("searchVal")).sendKeys("bags");
			driver.findElement(By.className("ic-search")).click();
			driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-Men')]")).click();
	        driver.findElement(By.xpath("//label[@id=\"facets\"]/div[2]/ul/li[2]/div/div/div[2]/ul/li[2]/div/div/label/text()"))
	        .click();
			
		}
}