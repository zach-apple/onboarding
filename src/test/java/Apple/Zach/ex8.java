package Apple.Zach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ex8 {
	@Test
public void testEx8() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Sortable Data Tables")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]")).getText());
	System.out.println(driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]")).getText());
	WebElement table1 = driver.findElement(By.xpath("//*[@id=\"table1\"]"));
	List<WebElement> list1 = table1.findElements(By.tagName("tr"));
	int index = 1;
	for(WebElement e : list1) {
		List<WebElement> row = e.findElements(By.tagName("td"));
		int col = 1;
		for(WebElement r : row) {
			if(r.getText().equals("jdoe@hotmail.com")) {
				System.out.println("Row " + index + " Col "+ col);
			}
			col++;
		}
		index++;
	}
	
	}
}
