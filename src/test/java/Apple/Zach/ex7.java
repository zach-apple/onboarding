package Apple.Zach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex7 {
	@Test
	public void testEx7() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/html/html_forms.asp");
		driver.findElement(By.xpath("//*[@id=\"main\"]/input[4]")).click();
	}
}
