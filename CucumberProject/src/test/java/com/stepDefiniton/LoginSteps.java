package com.stepDefiniton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	 WebDriver driver;
	 
	@Given("user is on loginPage")
	public void user_is_on_login_page() {
		
		System.out.println("Step1: User is on LoginPage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	  
	}

	@When("user use valid name and password")
			public void user_use_valid_name_and_password() {
		System.out.println("Step2: User enters valid userName and Password");
	    
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("user clicks on loginButton")
	public void user_clicks_on_login_button() {
		System.out.println("Step3 : User clicks on LoginButton");
	   
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user should land on homePage")
	public void user_should_land_on_home_page() {
		
		System.out.println("Step4: User lands on the homePage");
	    
		WebElement picture=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		picture.isDisplayed();
		
		driver.close();
	}



}
