import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Methods extends variables {

    private WebDriver driver;
    private String email = "emailblly@test.com";
    private String password = "123456789";

    public Methods(WebDriver driver) {
        this.driver = driver;
    }

    public boolean sendMessage(){
        driver.findElement(buttonContactUs).click();
        driver.findElement(subjectHeading).click();
        driver.findElement(dropDownList).click();
        driver.findElement(fieldEmail).sendKeys(email);
        driver.findElement(fieldOrderReference).sendKeys("1");
        driver.findElement(fieldMessage).sendKeys("Hello");
        driver.findElement(sendButton).click();
        return driver.findElement(message).isDisplayed();
    }

    public boolean messageNotSent(){
        driver.findElement(buttonContactUs).click();
        driver.findElement(subjectHeading).click();
        driver.findElement(dropDownList).click();
        driver.findElement(fieldEmail).sendKeys(email);
        driver.findElement(fieldOrderReference).sendKeys("1");
        driver.findElement(sendButton).click();
        return driver.findElement(messageAboutError).isDisplayed();
    }

    public boolean newUser() throws InterruptedException {
        driver.findElement(buttonSignIn).click();
        driver.findElement(emailAddress).sendKeys(email);
        driver.findElement(buttonCreateAnAccount).click();
        Thread.sleep(5000);
        driver.findElement(fieldFirstName).sendKeys("piwejgb");
        driver.findElement(fieldLastName).sendKeys("wegpmpoiwf");
        driver.findElement(fieldPassword).sendKeys(password);
        driver.findElement(fieldAddress).sendKeys("bworvboibppo");
        driver.findElement(fieldCity).sendKeys("bowneponwe");
        driver.findElement(fieldState).click();
        driver.findElement(nameState).click();
        driver.findElement(postalCode).sendKeys("12345");
        driver.findElement(mobilePhone).sendKeys("1234567");
        driver.findElement(fieldDiffrentAddress).sendKeys("ohowievoiwg");
        driver.findElement(createAccountButton).click();
        return driver.findElement(myAccount).isDisplayed();


    }

    public boolean seachProduct(){
        driver.findElement(seachField).sendKeys("Blouse", "\n");
        return driver.findElement(productBlouse).isDisplayed();

    }

    public boolean addProduct() throws InterruptedException {

        WebElement merchandise =  driver.findElement(product);
        Actions actions = new Actions(driver);
        actions.moveToElement(merchandise).click().build().perform();

//        WebElement product = driver.findElement(By.xpath("//div[@class = 'left-block']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(product).click().build().perform();
        Thread.sleep(1000);
        driver.findElement(buttonAddToCart).click();
        Thread.sleep(5000);
        driver.findElement(buttonCart).click();
        return driver.findElement(commodity).isDisplayed();

    }

    public boolean removeProduct(){
        driver.findElement(buttonRemove).click();
        return driver.findElement(commodity).isDisplayed();
    }

    public boolean searchTShirts(){
        driver.findElement(buttonWomen).click();
        driver.findElement(tabTops).click();
        driver.findElement(tabTShirts).click();
        return driver.findElement(productTShirts).isDisplayed();
    }

    public boolean buyProduct() throws InterruptedException {
        driver.findElement(buyButton).click();
        driver.findElement(buttonProcessAddress).click();
        driver.findElement(checkBoxAgree).click();
        driver.findElement(buttonProcessCarrier).click();
        driver.findElement(payByCheck).click();
        driver.findElement(iConfirmMyOrder).click();
        driver.findElement(accountLoginUser).click();
        driver.findElement(myOrder).click();
        return driver.findElement(orderReference).isDisplayed();
    }
}