package com.demo.desktoptests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ch.retry.MaxRetryCount;
import com.ch.status.TestStatus;
import com.ch.utils.AssertUtil;
import com.ch.utils.MessageUtil;
import com.demo.common.tests.AbstractDemoTest;
import com.demo.desktoppages.GlobalPage;

public class GlobalTest_v2 extends AbstractDemoTest {
	

	//Using annotation to populated 
	@Test(groups = { "P1", "Home", "Smoke" }, description = "Load homepage and verify top navigation details are loaded",
			suiteName = "Smoke", testName = "TC01 - verify top navigation")
	public void isTopNavigation() throws Exception {
			populateTestReport("1", "Top Navigation Test 1", TestStatus.INFO, null, null);
			GlobalPage globalPage = new GlobalPage();
			testSetup();
			AssertUtil.assertTrue(globalPage.isTopNavigationDisplayed(), MessageUtil.isNotDisplayed("Top navigation"));
			populateSteps(MessageUtil.isDisplayed("Top navigation "),TestStatus.PASS,  takeScreenShot());
			AssertUtil.assertTrue(true, MessageUtil.isNotDisplayed("Top navigation menu"));
			populateSteps( MessageUtil.isDisplayed("Top navigation menu"),TestStatus.PASS,  takeScreenShot());
			AssertUtil.assertTrue(true, MessageUtil.linkIsNotPresent("Hamburger menu"));
			populateSteps( MessageUtil.linkIsPresent("Hamburger menu"),TestStatus.PASS,  takeScreenShot());

	}
	@Test(alwaysRun = true, groups = { "P2", "Home", "Smoke" },  testName = "verify isTopNavigation2")
	public void isTopNavigation2() throws Exception {
			System.out.println(" isTopNavigation2 called ");
			populateTestReport( "2", "Top Navigation Test 2", TestStatus.INFO, null, takeScreenShot());
			getTestReport().setSuiteName("Smoke");
			testSetup();
			// AssertUtil.assertTrue(GlobalPage.isTopNavigationDisplayed());
			populateSteps("Loaded Navigation Page",TestStatus.INFO,  takeScreenShot());
			AssertUtil.assertTrue(true, "Top navigation menu not displayed");
			populateSteps("Top navigation  menu is displayed",TestStatus.PASS,  takeScreenShot());
			AssertUtil.assertTrue(true, "Not Found menu bags in hamburger menu");
			populateSteps("Found menu bags in hamburger menu",TestStatus.PASS,  takeScreenShot());

	}
	@Test(groups = { "P1", "MyAccount", "Smoke" }, testName = "verify isTopNavigation3")
	public void isTopNavigation3() throws Exception {
			System.out.println(" isTopNavigation3 called ");
			populateTestReport("3", "Top Navigation Test 3", TestStatus.INFO, null, null);
			testSetup();
			// AssertUtil.assertTrue(GlobalPage.isTopNavigationDisplayed());
			populateSteps("Loaded Navigation Page",TestStatus.INFO,  takeScreenShot());
			AssertUtil.assertTrue(true, "Top navigation menu not displayed");
			populateSteps("Top navigation  menu is displayed",TestStatus.PASS,  takeScreenShot());
			AssertUtil.assertTrue(true, "Not Found menu bags in hamburger menu");
			populateSteps("Found menu bags in hamburger menu",TestStatus.PASS,  takeScreenShot());

	}
	@Test(groups = { "P1", "Home", "Smoke", "Regression" }, testName = "verify isTopNavigation4")
	public void isTopNavigation4() throws Exception {
			System.out.println(" isTopNavigation4 called ");
			populateTestReport( "4", "Top Navigation Test 4", TestStatus.INFO, null,null);
			testSetup();
			// AssertUtil.assertTrue(GlobalPage.isTopNavigationDisplayed());
			populateSteps("Loaded Navigation Page",TestStatus.INFO,  takeScreenShot());
			AssertUtil.assertTrue(true, "Top navigation menu not displayed");
			populateSteps("Top navigation  menu is displayed",TestStatus.PASS,  takeScreenShot());
			AssertUtil.assertTrue(true, "Not Found menu bags in hamburger menu");
			populateSteps("Found menu bags in hamburger menu",TestStatus.PASS,  takeScreenShot());

	}
	@Test(groups = { "P1", "MyAccount", "Smoke", "Regression" }, testName = "verify isTopNavigation5")
	public void isTopNavigation5(Method m) throws Exception {
			System.out.println(" isTopNavigation5 called ");
			populateTestReport( "5", "Top Navigation Test 5", TestStatus.INFO, null, null);
			testSetup();
			// AssertUtil.assertTrue(GlobalPage.isTopNavigationDisplayed());
			populateSteps("Loaded Navigation Page",TestStatus.INFO,  takeScreenShot());
			AssertUtil.assertTrue(true, "Top navigation menu not displayed");
			populateSteps("Top navigation  menu is displayed",TestStatus.PASS,  takeScreenShot());
			AssertUtil.assertTrue(true, "Not Found menu bags in hamburger menu");
			populateSteps("Found menu bags in hamburger menu",TestStatus.PASS,  takeScreenShot());

	}
	
	@Test(groups = { "P1", "Home", "Smoke" }, testName = "isTopNavigationFailure")
	public void isTopNavigationFailure(Method m) throws Exception {
			System.out.println(" isTopNavigationFailure called ");
			populateTestReport( "6", "Top Navigation Test 6", TestStatus.INFO, null, null);
			testSetup();
			// AssertUtil.assertTrue(GlobalPage.isTopNavigationDisplayed());
			populateSteps("Loaded Navigation Page",TestStatus.INFO,  takeScreenShot());
			Assert.assertTrue(true, "Top navigation menu not displayed");
			populateSteps("Top navigation  menu is displayed",TestStatus.PASS,  takeScreenShot());
			Assert.assertTrue(false, "Not Found menu bags in hamburger menu");
			populateSteps("Found menu bags in hamburger menu",TestStatus.PASS,  takeScreenShot());

	}
	
	@Test(groups = { "P1", "Home", "Smoke" })
	public void isTopNavigationFailureWithCustomExceptionInTheEnd() throws Exception {
			System.out.println(" isTopNavigationFailureWithCustomExceptionInTheEnd called ");
			populateTestReport("7", "Top Navigation Test 7", TestStatus.INFO, null, null);
			testSetup();
			populateSteps("Loaded Navigation Page",TestStatus.INFO,  takeScreenShot());
			Assert.assertTrue(true, "Top navigation menu not displayed");
			populateSteps("Top navigation  menu is displayed",TestStatus.PASS,  takeScreenShot());
			Assert.assertTrue(true, "Not Found menu bags in hamburger menu");
			populateSteps("Found menu bags in hamburger menu",TestStatus.PASS,  takeScreenShot());
			applicationException();

	}
	
	@MaxRetryCount(3)
	@Test( groups = { "P140", "Home", "Smoke" })
	public void isTopNavigationFailureWithRetry() throws Exception {
			System.out.println(" isTopNavigationFailureWithRetry ");
			populateTestReport( "8", "Top Navigation Test 8", TestStatus.INFO, null, null);
			testSetup();
			populateSteps("Loaded Navigation Page",TestStatus.INFO,  takeScreenShot());
			Assert.assertTrue(true, "Top navigation menu not displayed");
			populateSteps("Top navigation  menu is displayed",TestStatus.PASS,  takeScreenShot());
			Assert.assertTrue(true, "Not Found menu bags in hamburger menu");
			populateSteps("Found menu bags in hamburger menu",TestStatus.PASS,  takeScreenShot());
			applicationException();

	}

	private void applicationException() {
	 throw new WebDriverException("Some driver execption happened");
	}
}
