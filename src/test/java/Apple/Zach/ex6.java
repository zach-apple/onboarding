package Apple.Zach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ex6 {
	
	
	@Test
	public void testEx6() {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Dropdown")).click();
	Select sel = new Select(driver.findElement(By.id("dropdown")));
	sel.selectByIndex(0);
	sel.selectByValue("1");
	sel.selectByVisibleText("Option 2");
	
	}
}
