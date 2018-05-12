import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FinalTests {

    private WebDriver driver;
    private Methods methods;

    @BeforeMethod
    public void start() {

        driver = new ChromeDriver();

        methods = new Methods(driver);

        driver.get("http://automationpractice.com/index.php");

    }

//    @AfterMethod
//    public void quit(){
//
//        driver.quit();
//    }

    @Test
    public void successfulSendingIsDisplayed() {
        methods.sendMessage();
    }

    @Test
    public void messageAboutError(){
        methods.messageNotSent();
    }

    @Test
    public void createNewUser() throws InterruptedException {
        methods.newUser();
    }
}
