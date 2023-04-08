package org.training;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonWindow {

	public static void main(String[] args)  throws InterruptedException, IOException {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver d=new  ChromeDriver (co);
	d.manage().window().maximize();
	d.get("https://www.amazon.in/");
WebElement searchbox = d.findElement(By.id("twotabsearchtextbox"));
searchbox.sendKeys("iphone 14 pro  max",Keys.ENTER);
Thread.sleep(4000);
WebElement iphonegold = d.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
iphonegold.click();

WebElement addtocart = d.findElement(By.id("add-to-cart-button"));
addtocart.click();
Thread.sleep(5000);
//screenshot
File screenshotfile =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotfile, new File("C:\\Users\\New Pc\\Pictures.jpg"));


}
}