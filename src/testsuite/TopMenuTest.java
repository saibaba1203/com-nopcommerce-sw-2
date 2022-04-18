package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public  void userShouldNavigateToComputerPageSuccessfully(){
        driver.findElement(By.linkText("Computers")).click();
        String expectedMessage = "Computers";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Computers page is not displayed", expectedMessage, actualMessage);


    }
    @Test

    public  void userShouldNavigateToElectronicsPageSuccessfully(){
        driver.findElement(By.linkText("Electronics")).click();
        String expectedMessage = "Electronics";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Electronics  page is not displayed", expectedMessage, actualMessage);


    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        driver.findElement(By.linkText("Apparel")).click();
        String expectedMessage = "Apparel";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Apparel  page is not displayed", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedMessage = "Digital downloads";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Digital downloads page is not displayed",expectedMessage , actualMessage);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        driver.findElement(By.linkText("Books")).click();
        String expectedMessage = "Books";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Books page is not displayed",expectedMessage, actualMessage);
    }
@Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedMessage ="Jewelry";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text().'Jewelry')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Jewelry page is not displayed",expectedMessage,actualMessage);

}
@Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedMessage = "Gift Cards";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text().'Gift Cards')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Gift Cards is not displayed",expectedMessage,actualMessage);
}

}
