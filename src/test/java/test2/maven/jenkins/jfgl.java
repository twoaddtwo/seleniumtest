package test2.maven.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jfgl {
  @Test
  public void jf() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ywkj2014\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://aewtest.ywsoftware.com:6070/login.html");
       
	  driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("yangmeng");
	  driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("123456q");
	  driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	  Thread.sleep(6000);
	  
	  
	  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/div/section/ul/li[4]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"34\"]")).click();//进入缴费管理界面
      Thread.sleep(3000);
      
      driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"ip34\"]")));
      Thread.sleep(8000);
      driver.findElement(By.xpath("//*[@id=\"PayInfo\"]/tbody/tr[1]/td[8]")).click();//选择第一条合同
      Thread.sleep(3000);

      driver.findElement(By.xpath("//*[@id=\"PayableInfo\"]/tbody/tr/td[6]/button[1]")).click();//点击缴费按钮
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"PaymentType\"]/option[2]")).click();//选择现金
      
      
      driver.findElement(By.xpath("//*[@id=\"ConfirmPay\"]/span")).click();//点击缴费
      Thread.sleep(6000);
      
     
     driver.switchTo().defaultContent();
     Thread.sleep(6000);
     driver.findElement(By.xpath("/html/body/div[1]/aside[1]/div/section/div/div[2]/a[3]")).click();
     
	  
	  
  }
}
