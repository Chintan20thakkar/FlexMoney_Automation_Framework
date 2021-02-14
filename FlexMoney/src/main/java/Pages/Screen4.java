package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.ConfigFileReader;

public class Screen4 {

    WebDriver driver;

    public Screen4(WebDriver driver){

        this.driver=driver;
    }

    ConfigFileReader configFileReader;
    
    
    @FindBy(xpath ="//*[@id=\"accountNo\"]")
    WebElement debitCard;

    @FindBy(id ="submitButton")
    WebElement verifyDebitCard;



    public void verifyDebitcard() {
        
        
        configFileReader = new ConfigFileReader();
        debitCard.sendKeys(configFileReader.getMDebitCardDetails());
        verifyDebitCard.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
