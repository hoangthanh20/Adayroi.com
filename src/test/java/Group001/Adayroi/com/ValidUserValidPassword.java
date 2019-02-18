package Group001.Adayroi.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Log;
import Utility.Constant;
import Utility.ExcelUtils;

public class ValidUserValidPassword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		String username = ExcelUtils.getCellData(1, 1);
		System.out.println(username);
		String password = ExcelUtils.getCellData(1, 2);	
		System.out.println(password);
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
	}

}
 