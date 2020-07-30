import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	private RemoteWebDriver driver;

	@Before
	public void init() {
		ChromeOptions opts = new ChromeOptions();
		this.driver = new ChromeDriver(opts);
		this.driver.manage().window().maximize();
	}

	@Test
	public void test() {

		final String MOVIE_NAME = "Batman Test";
		final String SCREEN_DATE = "13102020";
		final String SCREEN_TIME = "1900";
		final String CUSTOMER_NAME = "Selenium";
		final String ADULTS = "1";

// CLICK ON SCREENS PAGE
		this.driver.get("http://localhost:3000");
		WebElement screensPage = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[1]");
		screensPage.click();

		assertEquals("http://localhost:3000/screens", this.driver.getCurrentUrl());

		// CLICK ON "VIEW A SCREEN" BUTTON
		this.driver.get("http://localhost:3000/screens");
		WebElement viewScreensButton = this.driver
				.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/p[1]/p[1]/button");
		viewScreensButton.click();

		assertTrue(this.driver.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/img").isDisplayed());

// CLICK ON OPENING TIMES
		WebElement openingPage = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[2]");
		openingPage.click();

		assertEquals("http://localhost:3000/opentimes", this.driver.getCurrentUrl());

// CLICK ON CLASSIFICATIONS
		WebElement classificationsPage = this.driver.findElementByXPath("/html/body/div/div/div[3]/nav/div/div/a[2]");
		classificationsPage.click();

		assertEquals("http://localhost:3000/filmClassification", this.driver.getCurrentUrl());

// CLICK ON GO BACK HOME
		WebElement homePage = this.driver.findElementByXPath("/html/body/div/div/div[3]/nav/div/div/a[1]");
		homePage.click();

		assertEquals("http://localhost:3000/", this.driver.getCurrentUrl());

// CLICK ON BOOK NOW
		WebElement bookNow = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[3]");
		bookNow.click();

		assertEquals("http://localhost:3000/ticketBookings", this.driver.getCurrentUrl());

// CREATE A BOOKING
//		this.driver.get("http://localhost:3000/ticketBookings");
//
//		WebElement taskName = this.driver
//				.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/form/div[1]/form/div[1]/input");
//		taskName.sendKeys(MOVIE_NAME);
//		WebElement taskDate = this.driver
//				.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/form/div[1]/form/div[2]/input");
//		taskDate.sendKeys(SCREEN_DATE);
//		WebElement taskTime = this.driver
//				.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/form/div[1]/form/div[3]/input");
//		taskTime.sendKeys(SCREEN_TIME);
//		WebElement taskLocation = this.driver
//				.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/form/div[1]/form/div[4]/input");
//		taskLocation.sendKeys(CUSTOMER_NAME);
//		WebElement adults = this.driver
//				.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/form/div[1]/form/div[7]/select");
//		adults.sendKeys(ADULTS);
//
//		adults.sendKeys(Keys.PAGE_DOWN);

//// ACCEPT ALERT
//		WebDriverWait wait = new WebDriverWait(driver, 2);
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

	}

	@After
	public void tearDown() {
		this.driver.quit();
	}

}
