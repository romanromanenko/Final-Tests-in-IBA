import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Methods {

    private WebDriver driver;

    public Methods(WebDriver driver) {
        this.driver = driver;
    }

    public void sendMessage(){
        WebElement buttonContactUs = driver.findElement(By.id("contact-link"));
        buttonContactUs.click();
        WebElement subjectHeading = driver.findElement(By.id("uniform-id_contact"));
        subjectHeading.click();
        WebElement dropDownList = driver.findElement(By.xpath("//*[@id='id_contact']/option[2]"));
        dropDownList.click();
        WebElement fieldEmail = driver.findElement(By.id("email"));
        fieldEmail.sendKeys("email@test.com");
        WebElement fieldOrderReference = driver.findElement(By.id("id_order"));
        fieldOrderReference.sendKeys("1");
        WebElement fieldMessage = driver.findElement(By.id("message"));
        fieldMessage.sendKeys("Hello");
        WebElement sendButton = driver.findElement(By.id("submitMessage"));
        sendButton.click();
        WebElement message = driver.findElement(By.xpath(" //div[@id = 'center_column']/p"));
        Assert.assertTrue(message.isDisplayed(), "Masage display");
    }

    public void messageNotSent(){
        WebElement buttonContactUs = driver.findElement(By.id("contact-link"));
        buttonContactUs.click();
        WebElement subjectHeading = driver.findElement(By.id("uniform-id_contact"));
        subjectHeading.click();
        WebElement dropDownList = driver.findElement(By.xpath("//*[@id= 'id_contact']/option[2]"));
        dropDownList.click();
        WebElement fieldEmail = driver.findElement(By.id("email"));
        fieldEmail.sendKeys("email@test.com");
        WebElement fieldOrderReference = driver.findElement(By.id("id_order"));
        fieldOrderReference.sendKeys("1");
        WebElement sendButton = driver.findElement(By.id("submitMessage"));
        sendButton.click();
        WebElement messageAboutError= driver.findElement(By.xpath("//div[@id= 'center_column']/div/ol/li"));
        Assert.assertTrue(messageAboutError.isDisplayed(), "Masage display");
    }

    public void newUser() throws InterruptedException {
        WebElement buttonContactUs = driver.findElement(By.xpath("//*[@title = 'Log in to your customer account']"));
        buttonContactUs.click();
        WebElement emailAddress = driver.findElement(By.id("email_create"));
        emailAddress.sendKeys("213email@test.com");
        WebElement buttonCreateAnAccount = driver.findElement(By.id("SubmitCreate"));
        buttonCreateAnAccount.click();
        Thread.sleep(5000);
        WebElement firstName = driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("piwejgb");
        WebElement name = driver.findElement(By.id("customer_lastname"));
        name.sendKeys("wegpmpoiwf");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("123456789");
        WebElement address = driver.findElement(By.id("address1"));
        address.sendKeys("bworvboibppo");
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("bowneponwe");
//        WebElement country = driver.findElement(By.id("id_country"));
//        country.click();
        WebElement nameCountry = driver.findElement(By.xpath("//*[@id='id_country']/option[2]"));
        nameCountry.click();
        WebElement state = driver.findElement(By.id("id_state"));
        state.click();
        WebElement nameState = driver.findElement(By.xpath("//select[@id='id_state']/option[3]"));
        nameState.click();
        WebElement postalCode = driver.findElement(By.id("postcode"));
        postalCode.sendKeys("12345");
        WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("1234567");
        WebElement diffrentAddress = driver.findElement(By.id("alias"));
        diffrentAddress.sendKeys("ohowievoiwg");
        WebElement createAccountButton = driver.findElement(By.id("submitAccount"));
        createAccountButton.click();
    }
}
