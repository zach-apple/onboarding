package Apple.Zach;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ex10 {
	@Test
	public void testEx10() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 1:")).click();
		driver.findElement(By.tagName("Button")).click();
		try {
			new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("finish"))));

			System.out.println("Hello World is visible.");
		} catch (TimeoutException toe) {
			toe.printStackTrace();
		} finally {
			driver.close();
			driver.quit();
		}
	}
	@Test
	public void test2Ex10() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 1:")).click();
		driver.findElement(By.tagName("Button")).click();
		try {
			new WebDriverWait(driver, 5).until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));

			System.out.println("Loading is not visible.");
		} catch (TimeoutException toe) {
			toe.printStackTrace();
		} finally {
			driver.close();
			driver.quit();
		}
		
		
	}
	
	@Test
	public void test3Ex10() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 1:")).click();
		driver.findElement(By.tagName("Button")).click();
		try {
			new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));

			System.out.println("'Hello World' is present");
		} catch (TimeoutException toe) {
			toe.printStackTrace();
		} finally {
			driver.close();
			driver.quit();
		}
		
		
	}

}
