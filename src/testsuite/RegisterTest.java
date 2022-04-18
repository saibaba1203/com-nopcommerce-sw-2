package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        driver.findElement (By.linkText("Register")).click();
    String expectedMessage = "Register";
    WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
    String actualMessage = message.getText();
    Assert.assertEquals("Register page is not displayed", expectedMessage, actualMessage);

}
@Test
    public void userSholdRegisterAccountSuccessfully(){
    driver.findElement (By.linkText("Register")).click();
    driver.findElement (By.xpath("//input[@id='gender-male']")).click();
    driver.findElement (By.xpath("//input[@id='FirstName']")).sendKeys("sanket");
    driver.findElement (By.xpath("//input[@id='LastName']")).sendKeys("desai");
    driver.findElement (By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("16");
    driver.findElement (By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
    driver.findElement (By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1983");
    driver.findElement (By.xpath("//input[@id='Email']")).sendKeys("sanketdesai_2010@yahoo.com");
    driver.findElement (By.xpath("//input[@id='Password']")).sendKeys("sanket123");
    driver.findElement (By.xpath("//input[@id='ConfirmPassword']")).sendKeys("sanket123");
    driver.findElement (By.xpath("//button[@id='register-button']")).click();
    String expectedMessage = "Your registration completed";
    WebElement message = driver.findElement(By.xpath("//div[@class='result']"));
    String actualMessage = message.getText();
    Assert.assertEquals("Registration page is not displayed", expectedMessage, actualMessage);

}

}
