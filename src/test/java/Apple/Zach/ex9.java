package Apple.Zach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ex9 {
	@Test
	public void testEx9Success() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Form Authentication")).click();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		String expectedMsg = "You logged into a secure area!";
		String msg = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
		Assert.assertTrue(msg.contains(expectedMsg), "Something went wrong!");
	}
	@Test
	public void testEx9Fails() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Form Authentication")).click();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("!");
		driver.findElement(By.className("radius")).click();
		String expectedMsg = "Your password is invalid!";
		String msg = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
		Assert.assertTrue(msg.contains(expectedMsg), "Something went wrong!");
	}
}
