package cucumberframework.steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	WebDriver driver;

	@Before
	public void setUp() throws IOException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe ");
		this.driver = new FirefoxDriver();
	}

	@Given("^User navigates to the Stackoverflow website$")
	public void user_navigates_to_the_Stackoverflow_website() {
		this.driver.get("http://stackoverflow.com");
	}

	@Given("^User clicks on Login button$")
	public void user_clicks_on_Login_button() {
		this.driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[3]/a")).click();
		//		xPath /html/body/header/div/ol[2]/li[3]/a
	}

	@Given("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		this.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("webdriveruniversity2@mail.com");
		//		xPath //*[@id="email"]
	}

	@Given("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		this.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Yellow321!");
		//		xPath //*[@id="password"]
	}

	@When("^User clicks on the Submit$")
	public void user_clicks_on_the_Submit() throws Throwable {
		this.driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
		//		xPath //*[@id="submit-button"]
	}

	@Then("^User is taken to home page successfully$")
	public void user_is_taken_to_home_page_successfully() {
		WebElement askQuestionButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/a"));
		assertEquals(true, askQuestionButton.isDisplayed());
		driver.close();
		//		xPath /html/body/div[3]/div[2]/div[1]/div[1]/div/a
	}
	
//////////////////////////////
	
	@Given("User navigates to the Stackoverflow website2")
	public void user_navigates_to_the_stackoverflow_website2() {
	   System.out.println("User navigates to the Stackoverflow website2");
	}
	@Given("User clicks on Login button2")
	public void user_clicks_on_login_button2() {
		System.out.println("User clicks on Login button2");
	}
	@Given("User enters valid username2")
	public void user_enters_valid_username2() {
		System.out.println("User enters valid username2");
	}
	@Given("User enters valid password2")
	public void user_enters_valid_password2() {
		System.out.println("User enters valid password2");
	}
	@When("User clicks on the Submit2")
	public void user_clicks_on_the_submit2() {
		System.out.println("User clicks on the Submit2");;
	}
	@Then("User is taken to home page successfully2")
	public void user_is_taken_to_home_page_successfully2() {
		System.out.println("User is taken to home page successfully2");
	}
}
