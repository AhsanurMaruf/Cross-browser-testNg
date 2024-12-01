package Testing;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class crossBrowserTest {

    WebDriver driver;

   
	
	@BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser) {
        System.out.println("Launching " + browser + " browser...");

        if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "D:\\eclips\\msedgedriver.exe");
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            driver = new EdgeDriver(options);
            System.out.println("Edge browser launched successfully.");
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\eclips\\chromedriver-win64\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
            System.out.println("Chrome browser launched successfully.");
        }else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\eclips\\geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized"); // Note: Firefox does not support this directly; workaround explained below.
            driver = new FirefoxDriver(options);
            System.out.println("Firefox browser launched successfully.");
        }
 else {
            System.out.println("Unsupported browser: " + browser);
        }
    }

	 @Test
	  public void newfinal() {
	    driver.get("https://www.globalsqa.com/samplepagetest/");
	    //driver.manage().window().setSize(new Dimension(638, 824));
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("h1")).click();
	    //assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Sample Page Test"));
	    driver.findElement(By.id("post-2599")).click();
	    driver.findElement(By.id("g2599-name")).click();
	    driver.findElement(By.id("g2599-name")).sendKeys("maruf");
	    driver.findElement(By.id("g2599-email")).click();
	    driver.findElement(By.id("g2599-email")).sendKeys("marufahsan818@gmail.com");
	    driver.findElement(By.id("g2599-website")).click();
	    driver.findElement(By.id("g2599-website")).sendKeys("https://www.globalsqa.com/samplepagetest/#google_vignette");
	    driver.findElement(By.id("g2599-experienceinyears")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("g2599-experienceinyears"));
	      dropdown.findElement(By.xpath("//option[. = '1-3']")).click();
	    }
	    driver.findElement(By.cssSelector(".grunion-checkbox-multiple-label:nth-child(4) > .checkbox-multiple")).click();
	    driver.findElement(By.name("g2599-education")).click();
	    driver.findElement(By.cssSelector("button:nth-child(7)")).click();
	    //assertThat(driver.switchTo().alert().getText(), is("Do you really fill rest of the form?"));
	    driver.switchTo().alert().accept();
	   // assertThat(driver.switchTo().alert().getText(), is("Good Luck. Go for it"));
	    driver.findElement(By.id("contact-form-comment-g2599-comment")).click();
	    driver.findElement(By.id("contact-form-comment-g2599-comment")).click();
	    driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("this is my final exam");
	    driver.findElement(By.cssSelector(".pushbutton-wide")).click();
	    //js.executeScript("window.scrollTo(0,1542.4000244140625)");
	    driver.findElement(By.cssSelector("#contact-form-2599 > h3")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".twelve"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".twelve"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".twelve"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector(".twelve")).click();
	    driver.findElement(By.cssSelector("#contact-form-2599 > h3")).click();
	    //assertThat(driver.findElement(By.cssSelector("#contact-form-2599 > h3")).getText(), is("Message Sent (go back)"));
	    driver.findElement(By.cssSelector(".content_bgr")).click();
	  }
 
    
	@AfterMethod
	@AfterClass
    public void tearDown() {
        // Wait a few seconds before closing to ensure page is loaded and interactions are completed
        try {
            Thread.sleep(3000); // Wait for 3 seconds before closing the browser
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        if (driver != null) {
            driver.quit();  // Close the browser
            System.out.println("Browser closed successfully.");
        }
    }
}