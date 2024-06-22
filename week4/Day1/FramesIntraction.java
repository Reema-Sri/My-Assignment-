package week4.Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIntraction {

	private static String text;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver frame = new ChromeDriver();
		frame.manage().window().maximize();
		frame.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		frame.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		frame.switchTo().frame("iframeResult");
		frame.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = frame.switchTo().alert();
		alert.sendKeys("Reema");
		alert.accept();
		text = frame.findElement(By.id("demo")).getText();
		System.out.println(text);
		frame.close();
		
	}

}
