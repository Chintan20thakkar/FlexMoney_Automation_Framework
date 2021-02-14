package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.ConfigFileReader;

public class Screen2 {
    
    
    WebDriver Driver;


    public Screen2(WebDriver driver) {

        this.Driver=driver;
    }
    
    
    ConfigFileReader configFileReader;

    @FindBy(id="payment-enter-mobile")
    WebElement correctmobno;
    

    @FindBy(id="submitButton")
    WebElement subumitbitton;



    public void enterCorrectMobNo () {
        
        
        configFileReader = new ConfigFileReader();
        correctmobno.sendKeys(configFileReader.getMobileno());
        subumitbitton.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    
   

}
