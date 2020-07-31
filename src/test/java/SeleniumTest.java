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

	private RemoteWebDriver driver;
	final String MOVIE_NAME = "Batman Test";
	final String SCREEN_DATE = "13102020";
	final String SCREEN_TIME = "1900";
	final String CUSTOMER_NAME = "Selenium";
	final String ADULTS = "1";
	
	@Before
	public void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.get("http://localhost:3000");
	}

	
	//Web Pages
	@Test
	public void ScreenPage() {
// CLICK ON SCREENS PAGE
		WebElement screensPage = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[1]");
		screensPage.click();

		assertEquals("http://localhost:3000/screens", this.driver.getCurrentUrl());

	}
	
	@Test
	public void StandardSeatingPlanLink() {
		WebElement link = driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[1]");
		link.click();
		
		WebElement link2 = driver.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/p[1]/p[1]/button");
		link2.click();

		String imgCon = (driver.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/img").getAttribute("src"));
		String imgSrcSS = ("http://localhost:3000/static/media/standard-seating-plan.e1ca5537.jpg");
		
		assertEquals(imgSrcSS, imgCon);
	  
	}
	@Test
	public void StandardDecorLink() {
		
		WebElement link = driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[1]");
		link.click();
		
		WebElement link2 = driver.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/p[1]/p[2]/button");
		link2.click();
		String imgCon = (driver.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/img").getAttribute("src"));
		String imgSrcSS = ("http://localhost:3000/static/media/standard-decor.2e445208.jpg");
		
		assertEquals(imgSrcSS, imgCon);
	  
	}
	@Test
	public void DuluxeSeatingPlanLink() {
		
		WebElement link = driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[1]");
		link.click();
		
		WebElement link2 = driver.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/p[2]/p[1]/button");
		                                            
		link2.click();
		String imgCon = (driver.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/img").getAttribute("src"));
		String imgSrcSS = ("http://localhost:3000/static/media/duluxe-seating-plan.45ade18f.png");
		
		assertEquals(imgSrcSS, imgCon);
	  
	}
	@Test
	public void DuluxeDecorLink() {
	
		WebElement link = driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[1]");
		link.click();
		
		WebElement link2 = driver.findElementByXPath("/html/body/div/div/div[2]/div/div[2]/p[2]/p[2]/button ");
		link2.click();
		String imgCon = (driver.findElementByXPath("/html/body/div/div/div[2]/div/div[1]/img").getAttribute("src"));
		String imgSrcSS = ("http://localhost:3000/static/media/duluxe-decor.4f8be078.jpg");
		
		assertEquals(imgSrcSS, imgCon);
	  
	}
	@Test
	public void OpeningTimesPage() {
// CLICK ON OPENING TIMES
		WebElement openingPage = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[2]");
		openingPage.click();

		assertEquals("http://localhost:3000/opentimes", this.driver.getCurrentUrl());
	}
	@Test
	public void ClassificationsPage() {
// CLICK ON CLASSIFICATIONS
		WebElement classificationsPage = this.driver.findElementByXPath("/html/body/div/div/div[3]/nav/div/div/a[3]");
		classificationsPage.click();

		assertEquals("http://localhost:3000/filmClassification", this.driver.getCurrentUrl());
	}

		@Test
		public void BookNowPage() {
// CLICK ON BOOK NOW
		WebElement bookNow = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/a[3]");
		bookNow.click();

		assertEquals("http://localhost:3000/ticketBookings", this.driver.getCurrentUrl());
		}
		@Test
		public void NewReleasesPage() {
// CLICK ON NEW RELEASES
		WebElement filmslink = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/div/a");
	filmslink.click();
	WebElement newReleases = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/div/div/a[1]");
	newReleases.click();
	
		assertEquals("http://localhost:3000/releases", this.driver.getCurrentUrl());
		}

		@Test
		public void CurrenlyShowingPage() {
			// CLICK ON NEW RELEASES
					WebElement filmslink = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/div/a");
				filmslink.click();
				WebElement newReleases = this.driver.findElementByXPath("/html/body/div/div/div[1]/nav/div/div/div/div/a[2]");
				newReleases.click();
				
					assertEquals("http://localhost:3000/showing", this.driver.getCurrentUrl());
					}

		
		
		
		
		
		
// //CREATE A BOOKING
//	@Test
//		public void CreateABooking() {
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
//		adults.sendKeys(Keys.ENTER, Keys.TAB, Keys.TAB, Keys.ENTER  );
//		
//		
// //ACCEPT ALERT
//		WebDriverWait wait = new WebDriverWait(driver, 2);
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//
//		}
	@After
	public void endTest() {
		driver.close();
	}

}
