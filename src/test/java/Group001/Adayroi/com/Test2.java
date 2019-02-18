package Group001.Adayroi.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		String username = ExcelUtils.getCellData(1, 1);
		System.out.println(username);
		String password = ExcelUtils.getCellData(1, 2);	
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adayroi.com");
		driver.manage().window().maximize();
		//print log in message to the screen   
		System.out.println("open web");	
		Log.info("open web");
		Thread.sleep(5000);
		//click on Dang Nhap
		//driver.findElement(By.id("anonLogin")).click();
		driver.findElement(By.xpath("//span[@class='header-username']")).click();
		Thread.sleep(3000);  
		System.out.println("CLick Dang Nhap");
		Log.info("Click dang nhap");

		driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys(username);
		System.out.println("CLick Dang Nhap2");
		driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys(password);
		System.out.println("Input password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block js-login-btn']")).click();
		System.out.println("CLick buton Submit");
		Thread.sleep(2000);
	
		driver.quit();
		Log.info("Browser closed");
		 
		ExcelUtils.setCellData("Pass", 1, 3);

		Log.endTestCase("Selenium_Test_001");		
	}
	
	}

