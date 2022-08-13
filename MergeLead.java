package week6.day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class MergeLead extends ProjectSpecificMethods{

	@Test
	public void mergeLead() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window1.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(window1.get(0));
		
		driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(window2.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[7]")).click();
		driver.switchTo().window(window2.get(0));
		
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}

}
