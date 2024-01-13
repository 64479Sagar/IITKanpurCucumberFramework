package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NewUserRegitrationPage {

	WebDriver driver;
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://oag.iitk.ac.in/Oa_Rec_Pg/NewUser.do");
	}

	@When("user enter valid information")
	public void user_enter_valid_information() {
	    driver.findElement(By.name("userid")).sendKeys("sagar154242@");
	    driver.findElement(By.name("password")).sendKeys("sagar@154");
	    driver.findElement(By.name("confirmpassword")).sendKeys("sagar@154");
	    driver.findElement(By.name("email")).sendKeys("sagar@gmail.com");
	    
	    WebElement ques = driver.findElement(By.name("hintquestion"));
	    Select selQue = new Select(ques);
	    selQue.selectByVisibleText("What is your Mother's maiden name?");
	    
	    driver.findElement(By.name("hintanswer")).sendKeys("Suresh");
		
	}

	@When("validate registration details")
	public void validate_registration_details() throws InterruptedException {
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		Assert.assertEquals(title,"Newuser Registration Form");
	    
	}

	
}
