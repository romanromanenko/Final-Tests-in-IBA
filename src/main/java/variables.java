import org.openqa.selenium.By;

public class variables {

    protected By buttonContactUs = By.id("contact-link");
    protected By subjectHeading = By.id("uniform-id_contact");
    protected By dropDownList = By.xpath("//*[@id='id_contact']/option[2]");
    protected By fieldEmail = By.id("email");
    protected By fieldOrderReference = By.id("id_order");
    protected By fieldMessage = By.id("message");
    protected By sendButton = By.id("submitMessage");
    protected By message = By.xpath("//div[@id = 'center_column']/p");
    protected By messageAboutError = By.xpath("//div[@class = 'alert alert-danger']/ol");
    protected By buttonSignIn = By.xpath("//div[@class = 'header_user_info']");
    protected By emailAddress = By.id("email_create");
    protected By buttonCreateAnAccount = By.id("SubmitCreate");
    protected By fieldFirstName = By.id("customer_firstname");
    protected By fieldLastName = By.id("customer_lastname");
    protected By fieldPassword = By.id("passwd");
    protected By fieldAddress = By.id("address1");
    protected By fieldCity = By.id("city");
    protected By fieldState = By.id("id_state");
    protected By nameState = By.xpath("//select[@id='id_state']/option[3]");
    protected By postalCode = By.id("postcode");
    protected By mobilePhone = By.id("phone_mobile");
    protected By fieldDiffrentAddress = By.id("alias");
    protected By createAccountButton = By.id("submitAccount");
    protected By myAccount = By.id("center_column");
    protected By seachField = By.id("search_query_top");
    protected By productBlouse = By.xpath("//div[@class = 'left-block']");
    protected By product = By.xpath("//div[@class = 'left-block']");
    protected By buttonAddToCart = By.xpath("//button[@name = 'Submit']/span");
    protected By buttonCart = By.xpath("//a[@class= 'btn btn-default button button-medium']");
    protected By commodity = By.xpath("//td[@class = 'cart_product']");
    protected By buttonRemove = By.xpath("//a[@title = 'Delete']");
    protected By buttonWomen = By.xpath("//a[@title = 'Women']");
    protected By tabTops = By.xpath("//a[@title = 'Tops']/img");
    protected By tabTShirts = By.xpath("//a[@title = 'T-shirts']/img");
    protected By productTShirts = By.xpath("//div[@class = 'product-image-container']/a/img");
    protected By buyButton = By.xpath("//a[@class = 'button btn btn-default standard-checkout button-medium']");
    protected By buttonProcessAddress = By.xpath("//button[@name = 'processAddress']");
    protected By checkBoxAgree = By.xpath("//div[@id = 'uniform-cgv']/span");
    protected By buttonProcessCarrier = By.xpath("//button[@name = 'processCarrier']");
    protected By payByCheck = By.xpath("//a[@title = 'Pay by check.']");
    protected By iConfirmMyOrder = By.xpath("//button[@class = 'button btn btn-default button-medium']");
    protected By accountLoginUser = By.xpath("//a[@class = 'account']/span");
    protected By myOrder = By.xpath("//a[@title = 'Orders']");
    protected By orderReference = By.xpath("//th[@class = 'first_item footable-first-column']");
}
