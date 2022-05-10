package com.stepDefiniton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
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

	@When("^user use valid (.*) and (.*)$")
			public void user_enters__username_and_password (String username1, String password1) throws Throwable {
		System.out.println("Step2: User enters valid userName and Password");
	    
	driver.findElement(By.id("txtUsername")).sendKeys(username1);
	driver.findElement(By.id("txtPassword")).sendKeys(password1);
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
		
		driver.quit();
	}


	@When("user use valid credentials using DataTable")
	public void user_use_valid_credentials_using_data_table(DataTable dataTable) {
	    
		System.out.println("Step2: User enters valid userName and Password");
		List<List<String>> data=dataTable.cells();
	    
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));




}}
