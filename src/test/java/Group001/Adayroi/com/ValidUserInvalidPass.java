package Group001.Adayroi.com;

import org.testng.annotations.Test;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ValidUserInvalidPass {

	@Test(groups = { "SanityTest" })
	public void test1() throws Exception {
		System.out.println("test");
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		String username = ExcelUtils.getCellData(2, 1);
		System.out.println(username);
		String password = ExcelUtils.getCellData(2, 2);
		System.out.println(password);
		 Constant.driver.findElement(By.xpath("//span[@class='header-username']")).click();
		Thread.sleep(3000);
		System.out.println("CLick Dang Nhap");
		Log.info("Click dang nhap");

		Constant.driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys(username);
		System.out.println("CLick Dang Nhap2");
		Constant.driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys(password);
		System.out.println("Input password");
		Thread.sleep(2000);
		Constant.driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block js-login-btn']")).click();
		System.out.println("CLick buton Submit");
		Thread.sleep(2000);
		ExcelUtils.setCellData("Pass", 2, 3);
		Log.endTestCase("Selenium_Test_001");
	}

	@BeforeMethod(groups = { "SanityTest" })
	public void beforeMethod() throws Exception {
		HomePage.NavigateHomePage();
	}

	@AfterMethod(groups = { "SanityTest" })
	public void afterMethod() throws Exception {

		Constant.driver.close();
		Log.info("Browser closed");
	}

}
