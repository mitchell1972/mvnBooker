package specs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

/**
 * Created by mitchell on 30/10/16.
 */
public class Step {
String hotelName;
    @Managed
    WebDriver dr;


    @Given("^the user has logged into the hotel management platform$")
    public void the_user_has_logged_into_the_hotel_management_platform() throws Throwable {


        dr.get("http://localhost:3003/#");
        dr.findElement(By.xpath("/html/body/div/nav/div[1]/ul/li[2]/a")).click();
        dr.findElement(By.id("username")).sendKeys("admin");
        dr.findElement(By.id("password")).sendKeys("password");
        dr.findElement(By.id("doLogin")).click();
    }

    @Given("^All created entry are displayed$")
    public void all_created_entry_are_displayed() throws Throwable {

    }

    @Given("^the hotel name \"([^\"]*)\" is entered$")
    public void the_hotel_name_is_entered(String arg1) throws Throwable {

        dr.findElement(By.id("hotelName")).sendKeys(arg1);
    }

    @Given("^the address \"([^\"]*)\" is entered$")
    public void the_address_is_entered(String arg1) throws Throwable {

        dr.findElement(By.id("address")).sendKeys(arg1);
    }

    @Given("^the owner \"([^\"]*)\" is entered$")
    public void the_owner_is_entered(String arg1) throws Throwable {
        dr.findElement(By.id("owner")).sendKeys(arg1);
    }

    @Given("^the phone number \"([^\"]*)\" is entered$")
    public void the_phone_number_is_entered(String arg1) throws Throwable {
        dr.findElement(By.id("phone")).sendKeys(arg1);
    }

    @Given("^the email \"([^\"]*)\" is entered$")
    public void the_email_is_entered(String arg1) throws Throwable {
        dr.findElement(By.id("email")).sendKeys(arg1);
    }


    @When("^the following are entered:$")
    public void the_following_are_entered(DataTable arg1)  {

        dr.findElement(By.id("hotelName")).sendKeys(arg1.raw().get(0).get(1));
        dr.findElement(By.id("address")).sendKeys(arg1.raw().get(1).get(1));
        dr.findElement(By.id("owner")).sendKeys(arg1.raw().get(2).get(1));
        dr.findElement(By.id("phone")).sendKeys(arg1.raw().get(3).get(1));
        dr.findElement(By.id("email")).sendKeys(arg1.raw().get(4).get(1));
        hotelName = dr.findElement(By.className("container")).getText();
    }

    @When("^X associated with a particular is clicked$")
    public void x_associated_with_a_particular_is_clicked() throws Throwable {

    }

    @When("^the create button is clicked$")
    public void the_create_button_is_clicked() throws Throwable {
        dr.findElement(By.id("createHotel")).click();
        sleep(3000);
        dr.findElement(By.id("logout")).click();

    }

    @Then("^the page is update with the new entry$")
    public void the_page_is_update_with_the_new_entry() throws Throwable {

    }

    @Then("^the entry is deleted$")
    public void the_entry_is_deleted() throws Throwable {

    }

}
