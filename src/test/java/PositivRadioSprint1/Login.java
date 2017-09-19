package PositivRadioSprint1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Login {

	WebDriver driver = null;

	@BeforeMethod
	public void setup() throws InterruptedException, MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "10.3");
		caps.setCapability("deviceName", "iPhone Simulator");
		// caps.setCapability("noReset", true);

		// caps.setCapability("bundleid", "com.gate6.PositivRadioTest");
		// caps.setCapability("automationName", "XCUITest");
		caps.setCapability("app", "/Users/gatesix/Desktop/Payload.ipa");
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}

	// @Test(priority = 1)
	// public void login_logout() throws Exception {
	//
	// MobileElement clickAllow = (MobileElement)
	// (driver.findElement(By.name("Allow")));
	// clickAllow.click();
	//
	// Thread.sleep(4000);
	//
	// MobileElement UserName = (MobileElement) (driver.findElement(By.xpath(
	// "//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField")));
	// UserName.sendKeys("manish.dangas@gate6.com");
	//
	// MobileElement Passowrd = (MobileElement) (driver.findElement(By.xpath(
	// "//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField")));
	// Passowrd.sendKeys("Gate6@123");
	//
	// MobileElement ClickSign = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name='SIGN IN']")));
	// ClickSign.click();
	//// -------Browse button---
	// // Thread.sleep(6000);
	// // MobileElement BrowseButton = (MobileElement) (driver
	// //
	// .findElement(By.xpath("//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeButton")));
	// // BrowseButton.click();

	//
	// Thread.sleep(4000);
	// MobileElement clicksSttingIcon = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name='settingIcon']")));
	// clicksSttingIcon.click();
	//
	// (new TouchAction((MobileDriver) driver)).tap(243, 90).perform();
	//
	// Thread.sleep(2000);
	//
	// Screen s = new Screen();
	//
	// s.find("/Users/gatesix/Desktop/Yes.png"); // identify pause button
	//
	// s.click("/Users/gatesix/Desktop/Yes.png"); // click pause button
	//
	// Thread.sleep(4000);
	//
	// MobileElement CheckStatus = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name='SIGN IN']")));
	// String Content = CheckStatus.getText();
	//
	// System.out.println(Content);
	//
	// Assert.assertEquals("SIGN IN", Content);
	//
	// }

	// @Test(priority = 2)
	// public void SignUp() throws InterruptedException {
	//
	// MobileElement clickAllow = (MobileElement)
	// (driver.findElement(By.name("Allow")));
	// clickAllow.click();
	//
	// Thread.sleep(4000);
	// MobileElement SIGN_UP = (MobileElement) (driver.findElement(By.name("SIGN
	// UP")));
	// SIGN_UP.click();
	//
	// Thread.sleep(4000);
	// MobileElement FirstName = (MobileElement) (driver.findElement(By.xpath(
	// "//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[1]")));
	// FirstName.sendKeys("Test");
	//
	// MobileElement Email = (MobileElement) (driver.findElement(By.xpath(
	// "//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[2]")));
	// Email.sendKeys("Test27@mailinator.com");
	//
	// MobileElement Password = (MobileElement) (driver.findElement(By.xpath(
	// "//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField")));
	// Password.sendKeys("Gate6@123");
	//
	// MobileElement clicksSttingIcon = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name='SIGN UP']")));
	// clicksSttingIcon.click();
	//
	// (new TouchAction((MobileDriver) driver)).tap(177, 481).perform();
	//
	// MobileElement CheckStatus = (MobileElement) (driver
	// .findElement(By.name("Browse")));
	// String content = CheckStatus.getText();
	// System.out.println();
	// System.out.println(content);
	// System.out.println();
	// Assert.assertEquals("Browse", content);
	//
	// }

	// @Test(priority = 1)
	// public void SignUpGoogle() throws InterruptedException {
	//
	// MobileElement clickAllow = (MobileElement)
	// (driver.findElement(By.name("Allow")));
	// clickAllow.click();
	//
	// // -----------------------if mail account not found---------------//
	// // Thread.sleep(4000);
	// // MobileElement clickGoogle = (MobileElement) (driver
	// // .findElement(By.xpath("//XCUIElementTypeButton[@name=\"google2\"]")));
	// // clickGoogle.click();
	// //
	// // Thread.sleep(4000);
	// // MobileElement Email = (MobileElement) (driver
	// // .findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Email or
	// // phone\"]")));
	// // Email.sendKeys("gate6.info@gate6.com");
	// //
	// // Thread.sleep(4000);
	// // MobileElement Password = (MobileElement) (driver
	// // .findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"Enter your
	// // password\"]")));
	// // Password.sendKeys("Goole2010A!!");
	// //
	// // Thread.sleep(4000);
	// // MobileElement clickNext = (MobileElement) (driver
	// // .findElement(By.xpath("//XCUIElementTypeButton[@name=\"NEXT\"]")));
	// // clickNext.click();
	//
	// Thread.sleep(4000);
	// MobileElement clickGoogle = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name=\"google2\"]")));
	// clickGoogle.click();
	//
	// Thread.sleep(15000);
	// MobileElement SelectAccount = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name=\"Gate6 Info
	// gate6.info@gate6.com\"]")));
	// SelectAccount.click();
	//
	// Thread.sleep(4000);
	// MobileElement BrowseButton = (MobileElement) (driver.findElement(By.xpath(
	// "//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeButton")));
	// // BrowseButton.click();
	// Thread.sleep(4000);
	// String Status = BrowseButton.getText();
	//
	// System.out.println(Status);
	//
	//
	//
	// }

	@Test(priority = 1)
	public void SignUpFacebook() throws InterruptedException {

		MobileElement clickAllow = (MobileElement) (driver.findElement(By.name("Allow")));
		clickAllow.click();

	

		Thread.sleep(4000);
		MobileElement clickGoogle = (MobileElement) (driver
				.findElement(By.xpath("//XCUIElementTypeButton[@name=\"facebook\"]")));
		clickGoogle.click();

		// -----------------------if FB account not found---------------//
//		Thread.sleep(15000);
//		MobileElement email = (MobileElement) (driver
//				.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")));
//		email.sendKeys("manish.dangas@gate6.com");
//
//		Thread.sleep(4000);
//		MobileElement Password = (MobileElement) (driver
//				.findElement(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")));
//		Password.sendKeys("Gate6@321");
//
//		Thread.sleep(4000);
//		MobileElement ClickLogin = (MobileElement) (driver
//				.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log In\"]")));
//		ClickLogin.click();

		Thread.sleep(15000);
		MobileElement clickCountinue = (MobileElement) (driver
				.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Continue as Manish\"]")));
		clickCountinue.click();
		// XCUIElementTypeButton[@name="Continue as Manish"]

	}

	// @Test(priority = 1)
	// public void forgotPassword() throws InterruptedException {
	//
	// MobileElement clickAllow = (MobileElement)
	// (driver.findElement(By.name("Allow")));
	// clickAllow.click();
	//
	// Thread.sleep(4000);
	// MobileElement ClickForgotPass = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name='Forgot Password?']")));
	// ClickForgotPass.click();
	//
	// Thread.sleep(4000);
	// MobileElement Email = (MobileElement) (driver.findElement(By.xpath(
	// "//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")));
	// Email.sendKeys("test12@mailinator.com");
	//
	// Thread.sleep(4000);
	// MobileElement clickGeneratOTP = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name=\"GENERATE OTP\"]")));
	// clickGeneratOTP.click();
	//
	// Thread.sleep(4000);
	// Alert alert = driver.switchTo().alert();
	// String Response = alert.getText();
	// System.out.println(Response);
	//
	// Thread.sleep(4000);
	// Assert.assertEquals("PositivRadio\n" + "An email has been sent on request
	// email id with OTP, Login with OTP!",
	// Response);
	//
	// Thread.sleep(4000);
	// MobileElement ClickOK = (MobileElement)
	// (driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")));
	// ClickOK.click();
	//
	// Thread.sleep(4000);
	// MobileElement forgotPass = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name='Forgot Password?']")));
	// forgotPass.click();
	//
	// Thread.sleep(4000);
	// MobileElement clickEmail = (MobileElement) (driver.findElement(By.xpath(
	// "//XCUIElementTypeApplication[@name='PositivRadio']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")));
	// clickEmail.sendKeys("test1@mailinator.com");
	//
	// Thread.sleep(4000);
	// MobileElement GeneratOTP = (MobileElement) (driver
	// .findElement(By.xpath("//XCUIElementTypeButton[@name=\"GENERATE OTP\"]")));
	// GeneratOTP.click();
	//
	// Thread.sleep(4000);
	// Alert alert1 = driver.switchTo().alert();
	// String Response1 = alert1.getText();
	// System.out.println(Response1);
	//
	// Thread.sleep(4000);
	// Assert.assertEquals("PositivRadio\n" + "Email id is not registered. Please
	// try again!", Response1);
	//
	// }

	@AfterMethod
	public void tearDown() throws InterruptedException {

		Thread.sleep(10000);
		// driver.quit();
	}

}
