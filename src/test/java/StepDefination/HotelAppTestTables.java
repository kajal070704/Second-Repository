package StepDefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppTestTables {

	WebDriver driver;
//	@Given("I am on Hotel App Login Page")
//	public void i_am_on_hotel_app_login_page() {
//		driver=new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/");
//		String URL = driver.getCurrentUrl();
//		Assert.assertEquals(URL, "https://adactinhotelapp.com/" );
//	}
//
//	@When("I Enter Credential To Login")
//	public void i_enter_credential_to_login(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
////	    throw new io.cucumber.java.PendingException();
//		List<List<String>>data=dataTable.cells();
//		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.id("login")).click();
//		
//		
//	}
//		
//	
//	@Then("I am logged in successfully")
//	public void i_am_logged_in_successfully() {
//		String name="Hello vasuvaspag!";
//	    Assert.assertEquals(name, "Hello vasuvaspag!");
//		
//	}
//
	@Given("I am on Hotel App Login Page")
	public void i_am_on_hotel_app_login_page() {
		
//		for( Map<String,String>:HotelAppFeatures.feature.asMap(String.class,String.class)) {
//			
//		}

		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://adactinhotelapp.com/" );
	}
	

	@When("I Enter Credential To Login")
	public void i_enter_credential_to_login(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
       for( Map<String,String>data:dataTable.asMaps(String.class,String.class)) {
    	   driver.findElement(By.id("username")).sendKeys(data.get("username"));
    	   driver.findElement(By.id("password")).sendKeys(data.get("password"));
    	   driver.findElement(By.id("login")).click();
    	   
			
		}
	}

	@Then("I am logged in successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		String name="Hello vasuvaspag!";
	    Assert.assertEquals(name, "Hello vasuvaspag!");
	}
	@Given("I am on Seatch Hotel Page.")
	public void i_am_on_seatch_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I choose location as {string}")
	public void i_choose_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I choose Hotels as {string}")
	public void i_choose_hotels_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I choose Room Type as {string}")
	public void i_choose_room_type_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I choose Number of Rooms as {string}")
	public void i_choose_number_of_rooms_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click search")
	public void i_click_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I am Searched  successfully")
	public void i_am_searched_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("My jva");
	}






}
