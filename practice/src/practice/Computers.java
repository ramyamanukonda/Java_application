package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Computers {


		  
		  
		  
	   // @BeforeMethod
		public static void main(String[] args) throws InterruptedException{
			
			
			  String URL = "http://computer-database.herokuapp.com/computers";
			WebDriver wd = new FirefoxDriver();
			
			wd.get(URL);
			wd.manage().window().maximize();
			Thread.sleep(2000);
	    //}
	    //@Test(priority =0)
	    //public void Adding_new_computer() throws InterruptedException{
			
			wd.findElement(By.id("add")).click();
			wd.findElement(By.xpath(".//*[@id='name']")).sendKeys("ghtgyytyu");
			wd.findElement(By.xpath(".//*[@id='introduced']")).sendKeys("2006-05-11");
			wd.findElement(By.xpath(".//*[@id='discontinued']")).sendKeys("2014-08-15");
			Select company = new Select(wd.findElement(By.id("company")));
			company.selectByVisibleText("IBM");
			wd.findElement(By.xpath(".//*[@id='main']/form/div/input")).click();
			Thread.sleep(3000);
	  // }
			
		//@Test(priority=1)
		//public void Editing_computer(){
			wd.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[1]/a")).click();
			wd.findElement(By.xpath(".//*[@id='name']")).clear();
			wd.findElement(By.xpath(".//*[@id='name']")).sendKeys("lenovo");
			wd.findElement(By.xpath(".//*[@id='introduced']")).clear();
			wd.findElement(By.xpath(".//*[@id='introduced']")).sendKeys("2001-09-21");
			wd.findElement(By.xpath(".//*[@id='discontinued']")).sendKeys("2014-08-25");
			Select company1 = new Select(wd.findElement(By.xpath(".//*[@id='company']")));
			company1.selectByVisibleText("RCA");
			wd.findElement(By.xpath(".//*[@id='main']/form/div/input")).click();
			Thread.sleep(2000);
	
	//}
		//@Test(priority =3)
		//public void search(){
		
			wd.findElement(By.xpath(".//*[@id='searchbox']")).sendKeys("IBM");
			wd.findElement(By.xpath(".//*[@id='searchsubmit']")).click();
			Thread.sleep(2000);
		//}
		//@AfterMethod
		//public void close() {
			wd.quit();
		}

}
