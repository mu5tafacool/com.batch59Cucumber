package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutopracticePage {
    public AutopracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;
    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement email;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement create;
    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement mrs;
    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mr;
    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;
    @FindBy(xpath = "//*[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
    public WebElement positiveResultText;

    @FindBy(xpath = "//*[text()='Invalid email address.']")
    public WebElement negativeResultText;


}
