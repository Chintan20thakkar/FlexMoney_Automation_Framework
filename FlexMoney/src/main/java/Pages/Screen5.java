package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.ConfigFileReader;

public class Screen5 {


    WebDriver driver;

    public Screen5(WebDriver driver){

        this.driver=driver;
    }
    
    ConfigFileReader configFileReader;

    @FindBy(id ="otp")
    WebElement enterOTP;

    @FindBy(id ="instacredTncCheckbox")
    WebElement TnC;

    @FindBy(id ="submitButton")
    WebElement submitButton;


    public void OTP() {
        
        configFileReader = new ConfigFileReader();
        enterOTP.sendKeys(configFileReader.getOPT());
        TnC.click();
        submitButton.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }





}
