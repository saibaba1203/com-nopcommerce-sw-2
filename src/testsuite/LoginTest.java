package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public  void userShouldNavigateToLoginPageSuccessfully() {

        // Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find the login button and click on it
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginButton.click();

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get the text
        WebElement actuleMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actuleMessageElement.getText();
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

    }
    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials(){
// Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find the login button and click on it
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginButton.click();

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Sending email to email field element
        emailField.sendKeys("prime123@gmail.com");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        // Sending Password to password field element
        passwordField.sendKeys("Prime123");

        //Find the login button and click on it
        WebElement loginButton1 = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        //find the logout button and click on it
        WebElement logout = driver.findElement(By.linkText("Log out"));
        logout.click();

        String expectedErrorMessage = "Log out";
        String actualErrorMessage = driver.findElement(By.linkText("Log out")).getText();

        // Validate actual and expected message
        Assert.assertEquals("Log out", expectedErrorMessage, actualErrorMessage);
    }
@Test
public void verifyTheErrorMessage(){
    // Find log in link and click on login link
    WebElement loginLink = driver.findElement(By.linkText("Log in"));
    loginLink.click();

    //Find the login button and click on it
    WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
    loginButton.click();

    // Find the email field element
    WebElement emailField = driver.findElement(By.id("Email"));
    // Sending email to email field element
    emailField.sendKeys("prime12@gmail.com");

    // Find the password field element
    WebElement passwordField = driver.findElement(By.name("Password"));
    // Sending Password to password field element
    passwordField.sendKeys("Prime12");

    //Find the login button and click on it
    WebElement loginButton1 = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    loginButton.click();

    //invalid password message
    WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));


    //find the logout button and click on it
    WebElement logout = driver.findElement(By.linkText("Log out"));
    logout.click();

    String expectedErrorMessage = "Log out";
    String actualErrorMessage = driver.findElement(By.linkText("Log out")).getText();

    // Validate actual and expected message
    Assert.assertEquals("Log out", expectedErrorMessage, actualErrorMessage);
}





    @After
    public void tearDown() {
        closeBrowser();
    }

}






