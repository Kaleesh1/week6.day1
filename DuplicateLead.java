package week6.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DuplicateLead extends ProjectSpecificMethods{

	@Test
	public void duplicateLead() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("My Leads")).click();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement findElement = driver.findElement(By.name("submitButton"));
		builder.moveToElement(findElement).perform();
		findElement.click();
	}
}
