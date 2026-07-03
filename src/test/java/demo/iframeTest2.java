package iframeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframeTest2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("TKA");
		
		driver.switchTo().parentFrame();
		
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/h5")).getText());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click(); 
	}

}
