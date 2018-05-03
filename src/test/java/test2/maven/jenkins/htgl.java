package test2.maven.jenkins;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Calendar;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class htgl {
  @Test
  public void f() throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ywkj2014\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://aewtest.ywsoftware.com:6070/login.html");
       
	  driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("yangmeng");
	  driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("123456q");
	  driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	  Thread.sleep(6000);
	  
	  
	  driver.findElement(By.xpath("/html/body/div[1]/aside[1]/div/section/ul/li[4]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"82\"]")).click();//进入合同管理界面
      Thread.sleep(3000);
      
      driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"ip82\"]")));
      Thread.sleep(8000);
      driver.findElement(By.xpath("//*[@id=\"AddOneMember\"]")).click();//进入合同添加界面
      Thread.sleep(3000);
//      driver.findElement(By.xpath("//*[@id=\"ChosePartner\"]")).click();
//      driver.findElement(By.xpath("//*[@id=\"select2-partner-container\"]")).click();
//      driver.findElement(By.xpath("//*[@id=\"body\"]/span/span/span[1]/input")).sendKeys("闲云合作商");
//      Thread.sleep(3000);
//      driver.findElement(By.xpath("//*[@id=\"body\"]/span/span/span[2]")).click();
//      driver.findElement(By.xpath("//*[@id=\"sureChosePartner\"]")).click();
      
      driver.findElement(By.xpath("//*[@id=\"CardName\"]")).sendKeys("闲云");
      driver.findElement(By.xpath("//*[@id=\"CardMobile1\"]")).sendKeys("13342235261");
      driver.findElement(By.xpath("//*[@id=\"CardPostCode\"]")).sendKeys("123");
      driver.findElement(By.xpath("//*[@id=\"modalBrand\"]/option[5]")).click();//选择宝马品牌
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"modalSeries\"]/option[4]")).click();//选择车系宝马3系
      Thread.sleep(6000);
      driver.findElement(By.xpath("//*[@id=\"select2-cCarStyle-container\"]")).click();//选择车
      Thread.sleep(6000);
      driver.findElement(By.xpath("//*[@id=\"select2-cCarStyle-results\"]/li[2]")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"CarUseId\"]/option[2]")).click();//选择用途
      driver.findElement(By.xpath("//*[@id=\"CarNoBtn\"]")).click();//暂无车牌
      driver.findElement(By.xpath("//*[@id=\"CarEngineNo\"]")).sendKeys("111122");
      

      
      
	  Calendar c = Calendar.getInstance();//可以对每个时间域单独修改   

	  String year = String.valueOf(c.get(Calendar.YEAR));  

	  String month = String.valueOf(c.get(Calendar.MONTH));   

	  String date = String.valueOf(c.get(Calendar.DATE));    

	  String hour = String.valueOf(c.get(Calendar.HOUR_OF_DAY)+10);   

	  String minute = String.valueOf(c.get(Calendar.MINUTE)+10);   

	  String second = String.valueOf(c.get(Calendar.SECOND)+10);    

	  String chejianumber = "L000"+year+month+date+hour+minute+second;
      System.out.println(year);
      System.out.println(month);
      System.out.println(date);
      System.out.println(hour);
      System.out.println(minute);
      System.out.println(second);
      
      driver.findElement(By.xpath("//*[@id=\"CarFrameNo\"]")).sendKeys(chejianumber);//车架号
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"CarBuyDate\"]")).click();//首次登记日期
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div[3]/table/tbody/tr[1]/td[1]")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"IssuingDate\"]")).click();//发证日期
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"body\"]/div[4]/div[3]/table/tbody/tr[1]/td[2]")).click();
      driver.findElement(By.xpath("//*[@id=\"select2-CarInsurer-container\"]")).click();//商业保险公司
    
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"select2-CarInsurer-results\"]/li[2]")).click();
      driver.findElement(By.xpath("//*[@id=\"CarMilage\"]")).sendKeys("123");
      driver.findElement(By.xpath("//*[@id=\"product_code\"]/option[2]")).click();
      driver.findElement(By.xpath("//*[@id=\"SaleGroup\"]/option[2]")).click();
      driver.findElement(By.xpath("//*[@id=\"TeamAgentPeople\"]")).sendKeys("幸好");
      
      Thread.sleep(6000);
     driver.findElement(By.xpath("//*[@id=\"submitMemberInfo\"]/span")).click();
     driver.switchTo().defaultContent();
     
     Thread.sleep(6000);
     driver.findElement(By.xpath("/html/body/div[1]/aside[1]/div/section/div/div[2]/a[3]")).click();
  }


}
